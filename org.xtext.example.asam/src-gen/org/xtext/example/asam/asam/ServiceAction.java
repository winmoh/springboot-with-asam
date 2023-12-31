/**
 * generated by Xtext 2.33.0
 */
package org.xtext.example.asam.asam;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.asam.asam.ServiceAction#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.example.asam.asam.ServiceAction#getReturnType <em>Return Type</em>}</li>
 *   <li>{@link org.xtext.example.asam.asam.ServiceAction#getExceptionType <em>Exception Type</em>}</li>
 *   <li>{@link org.xtext.example.asam.asam.ServiceAction#getImplementation <em>Implementation</em>}</li>
 *   <li>{@link org.xtext.example.asam.asam.ServiceAction#getParameters <em>Parameters</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.asam.asam.AsamPackage#getServiceAction()
 * @model
 * @generated
 */
public interface ServiceAction extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.xtext.example.asam.asam.AsamPackage#getServiceAction_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.example.asam.asam.ServiceAction#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Return Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Return Type</em>' containment reference.
   * @see #setReturnType(RType)
   * @see org.xtext.example.asam.asam.AsamPackage#getServiceAction_ReturnType()
   * @model containment="true"
   * @generated
   */
  RType getReturnType();

  /**
   * Sets the value of the '{@link org.xtext.example.asam.asam.ServiceAction#getReturnType <em>Return Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Return Type</em>' containment reference.
   * @see #getReturnType()
   * @generated
   */
  void setReturnType(RType value);

  /**
   * Returns the value of the '<em><b>Exception Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Exception Type</em>' containment reference.
   * @see #setExceptionType(Type)
   * @see org.xtext.example.asam.asam.AsamPackage#getServiceAction_ExceptionType()
   * @model containment="true"
   * @generated
   */
  Type getExceptionType();

  /**
   * Sets the value of the '{@link org.xtext.example.asam.asam.ServiceAction#getExceptionType <em>Exception Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Exception Type</em>' containment reference.
   * @see #getExceptionType()
   * @generated
   */
  void setExceptionType(Type value);

  /**
   * Returns the value of the '<em><b>Implementation</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Implementation</em>' attribute.
   * @see #setImplementation(String)
   * @see org.xtext.example.asam.asam.AsamPackage#getServiceAction_Implementation()
   * @model
   * @generated
   */
  String getImplementation();

  /**
   * Sets the value of the '{@link org.xtext.example.asam.asam.ServiceAction#getImplementation <em>Implementation</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Implementation</em>' attribute.
   * @see #getImplementation()
   * @generated
   */
  void setImplementation(String value);

  /**
   * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.asam.asam.ActionParameter}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Parameters</em>' containment reference list.
   * @see org.xtext.example.asam.asam.AsamPackage#getServiceAction_Parameters()
   * @model containment="true"
   * @generated
   */
  EList<ActionParameter> getParameters();

} // ServiceAction