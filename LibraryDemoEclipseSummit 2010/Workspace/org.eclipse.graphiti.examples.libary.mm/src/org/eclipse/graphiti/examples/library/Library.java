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
 * A representation of the model object '<em><b>Library</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.graphiti.examples.library.Library#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.graphiti.examples.library.Library#getBooks <em>Books</em>}</li>
 *   <li>{@link org.eclipse.graphiti.examples.library.Library#getUsers <em>Users</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.graphiti.examples.library.LibraryPackage#getLibrary()
 * @model
 * @generated
 */
public interface Library extends EObject {
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
	 * @see org.eclipse.graphiti.examples.library.LibraryPackage#getLibrary_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.eclipse.graphiti.examples.library.Library#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Books</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.graphiti.examples.library.Book}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.graphiti.examples.library.Book#getLibrary <em>Library</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Books</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Books</em>' containment reference list.
	 * @see org.eclipse.graphiti.examples.library.LibraryPackage#getLibrary_Books()
	 * @see org.eclipse.graphiti.examples.library.Book#getLibrary
	 * @model opposite="library" containment="true"
	 * @generated
	 */
	EList<Book> getBooks();

	/**
	 * Returns the value of the '<em><b>Users</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.graphiti.examples.library.User}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.graphiti.examples.library.User#getLibrary <em>Library</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Users</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Users</em>' containment reference list.
	 * @see org.eclipse.graphiti.examples.library.LibraryPackage#getLibrary_Users()
	 * @see org.eclipse.graphiti.examples.library.User#getLibrary
	 * @model opposite="library" containment="true"
	 * @generated
	 */
	EList<User> getUsers();

} // Library
