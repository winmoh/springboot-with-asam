/**
 * generated by Xtext 2.33.0
 */
package org.xtext.example.asam.asam.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.xtext.example.asam.asam.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.xtext.example.asam.asam.AsamPackage
 * @generated
 */
public class AsamSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static AsamPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AsamSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = AsamPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case AsamPackage.SBOOT:
      {
        Sboot sboot = (Sboot)theEObject;
        T result = caseSboot(sboot);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AsamPackage.ELEMENT:
      {
        Element element = (Element)theEObject;
        T result = caseElement(element);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AsamPackage.CONFIGURATION:
      {
        Configuration configuration = (Configuration)theEObject;
        T result = caseConfiguration(configuration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AsamPackage.SERVER_INFO:
      {
        ServerInfo serverInfo = (ServerInfo)theEObject;
        T result = caseServerInfo(serverInfo);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AsamPackage.DATABASE_INFO:
      {
        DatabaseInfo databaseInfo = (DatabaseInfo)theEObject;
        T result = caseDatabaseInfo(databaseInfo);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AsamPackage.ENTITY:
      {
        Entity entity = (Entity)theEObject;
        T result = caseEntity(entity);
        if (result == null) result = caseElement(entity);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AsamPackage.DTO:
      {
        DTO dto = (DTO)theEObject;
        T result = caseDTO(dto);
        if (result == null) result = caseElement(dto);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AsamPackage.SERVICE:
      {
        Service service = (Service)theEObject;
        T result = caseService(service);
        if (result == null) result = caseElement(service);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AsamPackage.CONTROLLER:
      {
        Controller controller = (Controller)theEObject;
        T result = caseController(controller);
        if (result == null) result = caseElement(controller);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AsamPackage.REPOSITORY:
      {
        Repository repository = (Repository)theEObject;
        T result = caseRepository(repository);
        if (result == null) result = caseElement(repository);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AsamPackage.REPOSITORY_METHOD:
      {
        RepositoryMethod repositoryMethod = (RepositoryMethod)theEObject;
        T result = caseRepositoryMethod(repositoryMethod);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AsamPackage.FIND_BY_METHOD:
      {
        FindByMethod findByMethod = (FindByMethod)theEObject;
        T result = caseFindByMethod(findByMethod);
        if (result == null) result = caseRepositoryMethod(findByMethod);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AsamPackage.DELETE_BY_METHOD:
      {
        DeleteByMethod deleteByMethod = (DeleteByMethod)theEObject;
        T result = caseDeleteByMethod(deleteByMethod);
        if (result == null) result = caseRepositoryMethod(deleteByMethod);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AsamPackage.CUSTOM_QUERY_METHOD:
      {
        CustomQueryMethod customQueryMethod = (CustomQueryMethod)theEObject;
        T result = caseCustomQueryMethod(customQueryMethod);
        if (result == null) result = caseRepositoryMethod(customQueryMethod);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AsamPackage.SERVICE_ACTION:
      {
        ServiceAction serviceAction = (ServiceAction)theEObject;
        T result = caseServiceAction(serviceAction);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AsamPackage.CONTROLLER_ACTION:
      {
        ControllerAction controllerAction = (ControllerAction)theEObject;
        T result = caseControllerAction(controllerAction);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AsamPackage.ACTION_PARAMETER:
      {
        ActionParameter actionParameter = (ActionParameter)theEObject;
        T result = caseActionParameter(actionParameter);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AsamPackage.PROPERTY:
      {
        Property property = (Property)theEObject;
        T result = caseProperty(property);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AsamPackage.TYPE:
      {
        Type type = (Type)theEObject;
        T result = caseType(type);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AsamPackage.RTYPE:
      {
        RType rType = (RType)theEObject;
        T result = caseRType(rType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AsamPackage.LIST_TYPE:
      {
        ListType listType = (ListType)theEObject;
        T result = caseListType(listType);
        if (result == null) result = caseType(listType);
        if (result == null) result = caseRType(listType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AsamPackage.SET_TYPE:
      {
        SetType setType = (SetType)theEObject;
        T result = caseSetType(setType);
        if (result == null) result = caseType(setType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Sboot</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Sboot</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSboot(Sboot object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseElement(Element object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Configuration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Configuration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseConfiguration(Configuration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Server Info</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Server Info</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseServerInfo(ServerInfo object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Database Info</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Database Info</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDatabaseInfo(DatabaseInfo object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Entity</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Entity</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEntity(Entity object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>DTO</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>DTO</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDTO(DTO object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Service</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Service</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseService(Service object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Controller</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Controller</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseController(Controller object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Repository</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Repository</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRepository(Repository object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Repository Method</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Repository Method</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRepositoryMethod(RepositoryMethod object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Find By Method</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Find By Method</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFindByMethod(FindByMethod object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Delete By Method</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Delete By Method</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDeleteByMethod(DeleteByMethod object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Custom Query Method</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Custom Query Method</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCustomQueryMethod(CustomQueryMethod object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Service Action</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Service Action</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseServiceAction(ServiceAction object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Controller Action</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Controller Action</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseControllerAction(ControllerAction object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Action Parameter</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Action Parameter</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseActionParameter(ActionParameter object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Property</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Property</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseProperty(Property object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseType(Type object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>RType</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>RType</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRType(RType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>List Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>List Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseListType(ListType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Set Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Set Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSetType(SetType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //AsamSwitch