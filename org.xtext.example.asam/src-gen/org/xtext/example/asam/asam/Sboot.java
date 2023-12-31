/**
 * generated by Xtext 2.33.0
 */
package org.xtext.example.asam.asam;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sboot</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.asam.asam.Sboot#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.example.asam.asam.Sboot#getConfiguration <em>Configuration</em>}</li>
 *   <li>{@link org.xtext.example.asam.asam.Sboot#getElements <em>Elements</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.asam.asam.AsamPackage#getSboot()
 * @model
 * @generated
 */
public interface Sboot extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.xtext.example.asam.asam.AsamPackage#getSboot_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.example.asam.asam.Sboot#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Configuration</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Configuration</em>' containment reference.
   * @see #setConfiguration(Configuration)
   * @see org.xtext.example.asam.asam.AsamPackage#getSboot_Configuration()
   * @model containment="true"
   * @generated
   */
  Configuration getConfiguration();

  /**
   * Sets the value of the '{@link org.xtext.example.asam.asam.Sboot#getConfiguration <em>Configuration</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Configuration</em>' containment reference.
   * @see #getConfiguration()
   * @generated
   */
  void setConfiguration(Configuration value);

  /**
   * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.asam.asam.Element}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Elements</em>' containment reference list.
   * @see org.xtext.example.asam.asam.AsamPackage#getSboot_Elements()
   * @model containment="true"
   * @generated
   */
  EList<Element> getElements();

} // Sboot
