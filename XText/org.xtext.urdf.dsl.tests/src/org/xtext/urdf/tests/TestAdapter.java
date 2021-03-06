package org.xtext.urdf.tests;


import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.xtext.urdf.validation.DslValidator;

import uRDF.Axis;
import uRDF.Collision;
import uRDF.Geometry;
import uRDF.Joint;
import uRDF.JointType;
import uRDF.Limit;
import uRDF.Link;
import uRDF.Robot;
import uRDF.URDFFactory;
import uRDF.URDFModel;
import uRDF.URDFPackage;
import uRDF.impl.LinkImpl;
import uRDF.impl.RobotImpl;
import uRDF.impl.URDFFactoryImpl;
import uRDF.impl.URDFPackageImpl;

public class TestAdapter {

	
	public static Robot createTestUrdf() 	{
	   URDFFactory eINSTANCE = URDFFactoryImpl.init();
	   URDFModel model = eINSTANCE.createURDFModel();
	   URDFPackage pkg = URDFPackageImpl.init();
	   
	   //Robot
	   RobotImpl robot = (RobotImpl)eINSTANCE.createRobot();
	   robot.setName("test");
	   model.setRobot(robot);

	   //Links
	   LinkImpl link = (LinkImpl)eINSTANCE.createLink();
//	   link.eSet(URDFPackage.LINK__NAME, "URDFTestName");
	   link.setName("URDFLink1Testname");
	   
	   Collision col1 = eINSTANCE.createCollision();
	   col1.setName("TestCollision1");
	   Collision col2 = eINSTANCE.createCollision();
	   col2.setName("TestCollision2");
	   Geometry geo = eINSTANCE.createBox();
	   geo.setName("TestBox");
	   col1.setGeometry(geo);
	   EList<EObject> colList = new BasicEList<EObject>();
	   colList.add(col1);
	   colList.add(col2);
	   link.eSet(pkg.getLink_Collision(), colList);

	   Link link2 = eINSTANCE.createLink();
	   link2.setName("URDF2");
	   EList<Link> linkList = new BasicEList<Link>();
	   linkList.add(link);
	   linkList.add(link2);
	   robot.eSet(URDFPackage.ROBOT__LINK, linkList);
	

	   //Joints
	   Joint joint = eINSTANCE.createJoint();
	   joint.setName("Joint1");
	   joint.setChildOf(link);
	   joint.setType(JointType.FIXED);
	   joint.setParentOf(link2);
	   
	   
	   Joint joint2 = eINSTANCE.createJoint();
	   joint2.setName("Joint2");
	   joint2.setChildOf(link2);
	   joint2.setType(JointType.REVOLUTE);
	   Limit limit = eINSTANCE.createLimit();
	   limit.setEffort("4");
	   joint2.setLimit(limit);
	   
	   Axis axis = eINSTANCE.createAxis();
	   axis.setX(1);
	   joint2.setLimit(limit);
	   joint2.setAxis(axis);
	   
	   
	   EList<Joint> jointList = new BasicEList<Joint>();
	   jointList.add(joint);
	   jointList.add(joint2);
	   robot.eSet(URDFPackage.ROBOT__JOINT,jointList);
	   
	   // assert (ConstraintsAdapter.urdfValid(robot));
	   
	   return robot;
	   
	 
	}
	
	
	public static void main(String[] args) {
		Robot r = createTestUrdf();
		DslValidator dsl = new DslValidator();
		try {
			System.out.println("Validation is: " + dsl.checkURDFComplete(r));
		//	new UrdfGenerator().generate(r);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
