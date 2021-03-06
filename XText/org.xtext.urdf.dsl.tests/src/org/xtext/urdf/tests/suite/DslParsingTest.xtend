/*
 * generated by Xtext 2.10.0
 */
package org.xtext.urdf.tests.suite

import com.google.inject.Inject
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner
import org.eclipse.xtext.junit4.util.ParseHelper
import org.junit.Assert
import org.junit.Test
import org.junit.runner.RunWith
import uRDF.Robot
import org.junit.Before
import org.xtext.urdf.tests.DslInjectorProvider
import org.xtext.urdf.tests.TestAdapter

@RunWith(XtextRunner)
@InjectWith(DslInjectorProvider)
class DslParsingTest{
	//Robot robo
	
	@Inject extension ParseHelper<Robot>
	//ParseHelper<Robot> parseHelper

	/*
	 * Are elements created as expected by their respective default constructor in grammar 
	 * Are elements created as expected by Topology and iDerivedStateComputer
	 * Are elements based on Reuse created as expected
	 * Are Decorations created as expected
	 */

	@Test
	def void loadModel() {
		val result = '''
			Robot robo Link link1
		'''.parse
		
		Assert.assertNotNull(result.link)
		//val robototo = TestAdapter.createTestUrdf
		//Assert.assertNotNull(robototo)
	}
	
	// @Test 
	//def void initializeRobot() {
		//Assert.assertNotNull(robo)
	//}
	
	@Test 
	def void createLink() {
		val rob = TestAdapter.createTestUrdf
		val myLink = rob.link.get(0)
		Assert.assertEquals("URDFLink1Testname", myLink.name)
	}
	
	
	@Test 
	def void createJoint() {
		val roboto = TestAdapter.createTestUrdf
		val myJoint = roboto.joint.get(0)
		Assert.assertEquals("Joint1", myJoint.name)
		Assert.assertEquals("URDF2", myJoint.parentOf.name)
		Assert.assertEquals("URDFLink1Testname", myJoint.childOf.name)
	}
	
	

}
