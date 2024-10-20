/**
 * generated by Xtext 2.33.0
 */
package org.xtext.example.asam.asam;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>db Relations</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.xtext.example.asam.asam.AsamPackage#getdbRelations()
 * @model
 * @generated
 */
public enum dbRelations implements Enumerator
{
  /**
   * The '<em><b>M2M</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #M2M_VALUE
   * @generated
   * @ordered
   */
  M2M(0, "M2M", "ManyToMany"),

  /**
   * The '<em><b>M2O</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #M2O_VALUE
   * @generated
   * @ordered
   */
  M2O(1, "M2O", "ManyToOne"),

  /**
   * The '<em><b>O2M</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #O2M_VALUE
   * @generated
   * @ordered
   */
  O2M(2, "O2M", "OneToMany");

  /**
   * The '<em><b>M2M</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #M2M
   * @model literal="ManyToMany"
   * @generated
   * @ordered
   */
  public static final int M2M_VALUE = 0;

  /**
   * The '<em><b>M2O</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #M2O
   * @model literal="ManyToOne"
   * @generated
   * @ordered
   */
  public static final int M2O_VALUE = 1;

  /**
   * The '<em><b>O2M</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #O2M
   * @model literal="OneToMany"
   * @generated
   * @ordered
   */
  public static final int O2M_VALUE = 2;

  /**
   * An array of all the '<em><b>db Relations</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final dbRelations[] VALUES_ARRAY =
    new dbRelations[]
    {
      M2M,
      M2O,
      O2M,
    };

  /**
   * A public read-only list of all the '<em><b>db Relations</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<dbRelations> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>db Relations</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param literal the literal.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static dbRelations get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      dbRelations result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>db Relations</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param name the name.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static dbRelations getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      dbRelations result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>db Relations</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the integer value.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static dbRelations get(int value)
  {
    switch (value)
    {
      case M2M_VALUE: return M2M;
      case M2O_VALUE: return M2O;
      case O2M_VALUE: return O2M;
    }
    return null;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final int value;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final String name;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final String literal;

  /**
   * Only this class can construct instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private dbRelations(int value, String name, String literal)
  {
    this.value = value;
    this.name = name;
    this.literal = literal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int getValue()
  {
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getLiteral()
  {
    return literal;
  }

  /**
   * Returns the literal value of the enumerator, which is its string representation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    return literal;
  }
  
} //dbRelations
