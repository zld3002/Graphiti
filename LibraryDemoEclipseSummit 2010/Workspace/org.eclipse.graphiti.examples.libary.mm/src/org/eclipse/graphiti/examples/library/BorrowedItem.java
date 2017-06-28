/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.graphiti.examples.library;

import java.util.Date;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Borrowed Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.graphiti.examples.library.BorrowedItem#getItem <em>Item</em>}</li>
 *   <li>{@link org.eclipse.graphiti.examples.library.BorrowedItem#getUser <em>User</em>}</li>
 *   <li>{@link org.eclipse.graphiti.examples.library.BorrowedItem#getBorrowDate <em>Borrow Date</em>}</li>
 *   <li>{@link org.eclipse.graphiti.examples.library.BorrowedItem#getLastReturnDate <em>Last Return Date</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.graphiti.examples.library.LibraryPackage#getBorrowedItem()
 * @model
 * @generated
 */
public interface BorrowedItem extends EObject {
	/**
	 * Returns the value of the '<em><b>Item</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Item</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Item</em>' reference.
	 * @see #setItem(Book)
	 * @see org.eclipse.graphiti.examples.library.LibraryPackage#getBorrowedItem_Item()
	 * @model required="true"
	 * @generated
	 */
	Book getItem();

	/**
	 * Sets the value of the '{@link org.eclipse.graphiti.examples.library.BorrowedItem#getItem <em>Item</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Item</em>' reference.
	 * @see #getItem()
	 * @generated
	 */
	void setItem(Book value);

	/**
	 * Returns the value of the '<em><b>User</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.graphiti.examples.library.User#getBorrowedItems <em>Borrowed Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>User</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User</em>' container reference.
	 * @see #setUser(User)
	 * @see org.eclipse.graphiti.examples.library.LibraryPackage#getBorrowedItem_User()
	 * @see org.eclipse.graphiti.examples.library.User#getBorrowedItems
	 * @model opposite="borrowedItems" required="true" transient="false"
	 * @generated
	 */
	User getUser();

	/**
	 * Sets the value of the '{@link org.eclipse.graphiti.examples.library.BorrowedItem#getUser <em>User</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User</em>' container reference.
	 * @see #getUser()
	 * @generated
	 */
	void setUser(User value);

	/**
	 * Returns the value of the '<em><b>Borrow Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Borrow Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Borrow Date</em>' attribute.
	 * @see #setBorrowDate(Date)
	 * @see org.eclipse.graphiti.examples.library.LibraryPackage#getBorrowedItem_BorrowDate()
	 * @model
	 * @generated
	 */
	Date getBorrowDate();

	/**
	 * Sets the value of the '{@link org.eclipse.graphiti.examples.library.BorrowedItem#getBorrowDate <em>Borrow Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Borrow Date</em>' attribute.
	 * @see #getBorrowDate()
	 * @generated
	 */
	void setBorrowDate(Date value);

	/**
	 * Returns the value of the '<em><b>Last Return Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Last Return Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last Return Date</em>' attribute.
	 * @see #setLastReturnDate(Date)
	 * @see org.eclipse.graphiti.examples.library.LibraryPackage#getBorrowedItem_LastReturnDate()
	 * @model
	 * @generated
	 */
	Date getLastReturnDate();

	/**
	 * Sets the value of the '{@link org.eclipse.graphiti.examples.library.BorrowedItem#getLastReturnDate <em>Last Return Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Return Date</em>' attribute.
	 * @see #getLastReturnDate()
	 * @generated
	 */
	void setLastReturnDate(Date value);

} // BorrowedItem
