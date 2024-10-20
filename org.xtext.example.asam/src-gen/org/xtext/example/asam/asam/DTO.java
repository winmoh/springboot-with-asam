/**
 * generated by Xtext 2.33.0
 */
package org.xtext.example.asam.asam;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>DTO</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.asam.asam.DTO#getNom <em>Nom</em>}</li>
 *   <li>{@link org.xtext.example.asam.asam.DTO#getProperties <em>Properties</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.asam.asam.AsamPackage#getDTO()
 * @model
 * @generated
 */
public interface DTO extends Element
{
  /**
   * Returns the value of the '<em><b>Nom</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Nom</em>' attribute.
   * @see #setNom(String)
   * @see org.xtext.example.asam.asam.AsamPackage#getDTO_Nom()
   * @model
   * @generated
   */
  String getNom();

  /**
   * Sets the value of the '{@link org.xtext.example.asam.asam.DTO#getNom <em>Nom</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Nom</em>' attribute.
   * @see #getNom()
   * @generated
   */
  void setNom(String value);

  /**
   * Returns the value of the '<em><b>Properties</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.asam.asam.Property}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Properties</em>' containment reference list.
   * @see org.xtext.example.asam.asam.AsamPackage#getDTO_Properties()
   * @model containment="true"
   * @generated
   */
  EList<Property> getProperties();

} // DTO
