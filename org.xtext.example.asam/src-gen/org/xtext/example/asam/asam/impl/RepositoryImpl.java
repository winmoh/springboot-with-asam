/**
 * generated by Xtext 2.33.0
 */
package org.xtext.example.asam.asam.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.example.asam.asam.AsamPackage;
import org.xtext.example.asam.asam.CustomQueryMethod;
import org.xtext.example.asam.asam.DeleteByMethod;
import org.xtext.example.asam.asam.FindByMethod;
import org.xtext.example.asam.asam.Repository;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Repository</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.asam.asam.impl.RepositoryImpl#getFindBy <em>Find By</em>}</li>
 *   <li>{@link org.xtext.example.asam.asam.impl.RepositoryImpl#getDeleteBy <em>Delete By</em>}</li>
 *   <li>{@link org.xtext.example.asam.asam.impl.RepositoryImpl#getCustomQueryMethod <em>Custom Query Method</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RepositoryImpl extends ElementImpl implements Repository
{
  /**
   * The cached value of the '{@link #getFindBy() <em>Find By</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFindBy()
   * @generated
   * @ordered
   */
  protected EList<FindByMethod> findBy;

  /**
   * The cached value of the '{@link #getDeleteBy() <em>Delete By</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDeleteBy()
   * @generated
   * @ordered
   */
  protected EList<DeleteByMethod> deleteBy;

  /**
   * The cached value of the '{@link #getCustomQueryMethod() <em>Custom Query Method</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCustomQueryMethod()
   * @generated
   * @ordered
   */
  protected EList<CustomQueryMethod> customQueryMethod;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RepositoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return AsamPackage.Literals.REPOSITORY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<FindByMethod> getFindBy()
  {
    if (findBy == null)
    {
      findBy = new EObjectContainmentEList<FindByMethod>(FindByMethod.class, this, AsamPackage.REPOSITORY__FIND_BY);
    }
    return findBy;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<DeleteByMethod> getDeleteBy()
  {
    if (deleteBy == null)
    {
      deleteBy = new EObjectContainmentEList<DeleteByMethod>(DeleteByMethod.class, this, AsamPackage.REPOSITORY__DELETE_BY);
    }
    return deleteBy;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<CustomQueryMethod> getCustomQueryMethod()
  {
    if (customQueryMethod == null)
    {
      customQueryMethod = new EObjectContainmentEList<CustomQueryMethod>(CustomQueryMethod.class, this, AsamPackage.REPOSITORY__CUSTOM_QUERY_METHOD);
    }
    return customQueryMethod;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case AsamPackage.REPOSITORY__FIND_BY:
        return ((InternalEList<?>)getFindBy()).basicRemove(otherEnd, msgs);
      case AsamPackage.REPOSITORY__DELETE_BY:
        return ((InternalEList<?>)getDeleteBy()).basicRemove(otherEnd, msgs);
      case AsamPackage.REPOSITORY__CUSTOM_QUERY_METHOD:
        return ((InternalEList<?>)getCustomQueryMethod()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case AsamPackage.REPOSITORY__FIND_BY:
        return getFindBy();
      case AsamPackage.REPOSITORY__DELETE_BY:
        return getDeleteBy();
      case AsamPackage.REPOSITORY__CUSTOM_QUERY_METHOD:
        return getCustomQueryMethod();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case AsamPackage.REPOSITORY__FIND_BY:
        getFindBy().clear();
        getFindBy().addAll((Collection<? extends FindByMethod>)newValue);
        return;
      case AsamPackage.REPOSITORY__DELETE_BY:
        getDeleteBy().clear();
        getDeleteBy().addAll((Collection<? extends DeleteByMethod>)newValue);
        return;
      case AsamPackage.REPOSITORY__CUSTOM_QUERY_METHOD:
        getCustomQueryMethod().clear();
        getCustomQueryMethod().addAll((Collection<? extends CustomQueryMethod>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case AsamPackage.REPOSITORY__FIND_BY:
        getFindBy().clear();
        return;
      case AsamPackage.REPOSITORY__DELETE_BY:
        getDeleteBy().clear();
        return;
      case AsamPackage.REPOSITORY__CUSTOM_QUERY_METHOD:
        getCustomQueryMethod().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case AsamPackage.REPOSITORY__FIND_BY:
        return findBy != null && !findBy.isEmpty();
      case AsamPackage.REPOSITORY__DELETE_BY:
        return deleteBy != null && !deleteBy.isEmpty();
      case AsamPackage.REPOSITORY__CUSTOM_QUERY_METHOD:
        return customQueryMethod != null && !customQueryMethod.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //RepositoryImpl
