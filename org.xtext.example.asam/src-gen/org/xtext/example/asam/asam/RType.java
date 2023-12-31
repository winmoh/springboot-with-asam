/**
 * generated by Xtext 2.33.0
 */
package org.xtext.example.asam.asam;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>RType</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.asam.asam.RType#getVypes <em>Vypes</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.asam.asam.AsamPackage#getRType()
 * @model
 * @generated
 */
public interface RType extends EObject
{
  /**
   * Returns the value of the '<em><b>Vypes</b></em>' attribute.
   * The literals are from the enumeration {@link org.xtext.example.asam.asam.VTypes}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Vypes</em>' attribute.
   * @see org.xtext.example.asam.asam.VTypes
   * @see #setVypes(VTypes)
   * @see org.xtext.example.asam.asam.AsamPackage#getRType_Vypes()
   * @model
   * @generated
   */
  VTypes getVypes();

  /**
   * Sets the value of the '{@link org.xtext.example.asam.asam.RType#getVypes <em>Vypes</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Vypes</em>' attribute.
   * @see org.xtext.example.asam.asam.VTypes
   * @see #getVypes()
   * @generated
   */
  void setVypes(VTypes value);

} // RType