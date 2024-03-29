/**
 * generated by Xtext 2.33.0
 */
package org.xtext.example.asam.asam;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Controller</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.asam.asam.Controller#getBaseUrl <em>Base Url</em>}</li>
 *   <li>{@link org.xtext.example.asam.asam.Controller#getCactions <em>Cactions</em>}</li>
 *   <li>{@link org.xtext.example.asam.asam.Controller#getCparam <em>Cparam</em>}</li>
 *   <li>{@link org.xtext.example.asam.asam.Controller#getFparam <em>Fparam</em>}</li>
 *   <li>{@link org.xtext.example.asam.asam.Controller#getDparam <em>Dparam</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.asam.asam.AsamPackage#getController()
 * @model
 * @generated
 */
public interface Controller extends EObject
{
  /**
   * Returns the value of the '<em><b>Base Url</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Base Url</em>' attribute.
   * @see #setBaseUrl(String)
   * @see org.xtext.example.asam.asam.AsamPackage#getController_BaseUrl()
   * @model
   * @generated
   */
  String getBaseUrl();

  /**
   * Sets the value of the '{@link org.xtext.example.asam.asam.Controller#getBaseUrl <em>Base Url</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Base Url</em>' attribute.
   * @see #getBaseUrl()
   * @generated
   */
  void setBaseUrl(String value);

  /**
   * Returns the value of the '<em><b>Cactions</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.asam.asam.CustomAction}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Cactions</em>' containment reference list.
   * @see org.xtext.example.asam.asam.AsamPackage#getController_Cactions()
   * @model containment="true"
   * @generated
   */
  EList<CustomAction> getCactions();

  /**
   * Returns the value of the '<em><b>Cparam</b></em>' attribute.
   * The literals are from the enumeration {@link org.xtext.example.asam.asam.ParamTrasfert}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Cparam</em>' attribute.
   * @see org.xtext.example.asam.asam.ParamTrasfert
   * @see #setCparam(ParamTrasfert)
   * @see org.xtext.example.asam.asam.AsamPackage#getController_Cparam()
   * @model
   * @generated
   */
  ParamTrasfert getCparam();

  /**
   * Sets the value of the '{@link org.xtext.example.asam.asam.Controller#getCparam <em>Cparam</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Cparam</em>' attribute.
   * @see org.xtext.example.asam.asam.ParamTrasfert
   * @see #getCparam()
   * @generated
   */
  void setCparam(ParamTrasfert value);

  /**
   * Returns the value of the '<em><b>Fparam</b></em>' attribute.
   * The literals are from the enumeration {@link org.xtext.example.asam.asam.ParamTrasfert}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Fparam</em>' attribute.
   * @see org.xtext.example.asam.asam.ParamTrasfert
   * @see #setFparam(ParamTrasfert)
   * @see org.xtext.example.asam.asam.AsamPackage#getController_Fparam()
   * @model
   * @generated
   */
  ParamTrasfert getFparam();

  /**
   * Sets the value of the '{@link org.xtext.example.asam.asam.Controller#getFparam <em>Fparam</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Fparam</em>' attribute.
   * @see org.xtext.example.asam.asam.ParamTrasfert
   * @see #getFparam()
   * @generated
   */
  void setFparam(ParamTrasfert value);

  /**
   * Returns the value of the '<em><b>Dparam</b></em>' attribute.
   * The literals are from the enumeration {@link org.xtext.example.asam.asam.ParamTrasfert}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Dparam</em>' attribute.
   * @see org.xtext.example.asam.asam.ParamTrasfert
   * @see #setDparam(ParamTrasfert)
   * @see org.xtext.example.asam.asam.AsamPackage#getController_Dparam()
   * @model
   * @generated
   */
  ParamTrasfert getDparam();

  /**
   * Sets the value of the '{@link org.xtext.example.asam.asam.Controller#getDparam <em>Dparam</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Dparam</em>' attribute.
   * @see org.xtext.example.asam.asam.ParamTrasfert
   * @see #getDparam()
   * @generated
   */
  void setDparam(ParamTrasfert value);

} // Controller
