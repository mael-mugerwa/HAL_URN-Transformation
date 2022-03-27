/**
 */
package hal;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see hal.HalPackage
 * @generated
 */
public interface HalFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	HalFactory eINSTANCE = hal.impl.HalFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>HAL</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>HAL</em>'.
	 * @generated
	 */
	HAL createHAL();

	/**
	 * Returns a new object of class '<em>Room</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Room</em>'.
	 * @generated
	 */
	Room createRoom();

	/**
	 * Returns a new object of class '<em>Device</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Device</em>'.
	 * @generated
	 */
	Device createDevice();

	/**
	 * Returns a new object of class '<em>Sensor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sensor</em>'.
	 * @generated
	 */
	Sensor createSensor();

	/**
	 * Returns a new object of class '<em>Actuator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Actuator</em>'.
	 * @generated
	 */
	Actuator createActuator();

	/**
	 * Returns a new object of class '<em>Sensor Entry</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sensor Entry</em>'.
	 * @generated
	 */
	SensorEntry createSensorEntry();

	/**
	 * Returns a new object of class '<em>Actuator Entry</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Actuator Entry</em>'.
	 * @generated
	 */
	ActuatorEntry createActuatorEntry();

	/**
	 * Returns a new object of class '<em>Command</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Command</em>'.
	 * @generated
	 */
	Command createCommand();

	/**
	 * Returns a new object of class '<em>Automation Rule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Automation Rule</em>'.
	 * @generated
	 */
	AutomationRule createAutomationRule();

	/**
	 * Returns a new object of class '<em>Atomic Relational Term</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Atomic Relational Term</em>'.
	 * @generated
	 */
	AtomicRelationalTerm createAtomicRelationalTerm();

	/**
	 * Returns a new object of class '<em>Compound Relational Term</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Compound Relational Term</em>'.
	 * @generated
	 */
	CompoundRelationalTerm createCompoundRelationalTerm();

	/**
	 * Returns a new object of class '<em>Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Action</em>'.
	 * @generated
	 */
	Action createAction();

	/**
	 * Returns a new object of class '<em>Rule Entry</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rule Entry</em>'.
	 * @generated
	 */
	RuleEntry createRuleEntry();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	HalPackage getHalPackage();

} //HalFactory
