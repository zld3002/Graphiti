/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.graphiti.examples.library;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>User</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.graphiti.examples.library.User#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.graphiti.examples.library.User#getBorrowedItems <em>Borrowed Items</em>}</li>
 *   <li>{@link org.eclipse.graphiti.examples.library.User#getLibrary <em>Library</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.graphiti.examples.library.LibraryPackage#getUser()
 * @model
 * @generated
 */
public interface User extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.eclipse.graphiti.examples.library.LibraryPackage#getUser_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.eclipse.graphiti.examples.library.User#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Library</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.graphiti.examples.library.Library#getUsers <em>Users</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Library</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Library</em>' container reference.
	 * @see #setLibrary(Library)
	 * @see org.eclipse.graphiti.examples.library.LibraryPackage#getUser_Library()
	 * @see org.eclipse.graphiti.examples.library.Library#getUsers
	 * @model opposite="users" required="true" transient="false"
	 * @generated
	 */
	Library getLibrary();

	/**
	 * Sets the value of the '{@link org.eclipse.graphiti.examples.library.User#getLibrary <em>Library</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Library</em>' container reference.
	 * @see #getLibrary()
	 * @generated
	 */
	void setLibrary(Library value);

	/**
	 * Returns the value of the '<em><b>Borrowed Items</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.graphiti.examples.library.BorrowedItem}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.graphiti.examples.library.BorrowedItem#getUser <em>User</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Borrowed Items</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Borrowed Items</em>' containment reference list.
	 * @see org.eclipse.graphiti.examples.library.LibraryPackage#getUser_BorrowedItems()
	 * @see org.eclipse.graphiti.examples.library.BorrowedItem#getUser
	 * @model opposite="user" containment="true"
	 * @generated
	 */
	EList<BorrowedItem> getBorrowedItems();

} // User
