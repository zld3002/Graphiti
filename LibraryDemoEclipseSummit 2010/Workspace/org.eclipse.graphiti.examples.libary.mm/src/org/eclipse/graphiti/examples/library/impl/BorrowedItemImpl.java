/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.graphiti.examples.library.impl;

import java.util.Date;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

import org.eclipse.graphiti.examples.library.Book;
import org.eclipse.graphiti.examples.library.BorrowedItem;
import org.eclipse.graphiti.examples.library.LibraryPackage;
import org.eclipse.graphiti.examples.library.User;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Borrowed Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.graphiti.examples.library.impl.BorrowedItemImpl#getItem <em>Item</em>}</li>
 *   <li>{@link org.eclipse.graphiti.examples.library.impl.BorrowedItemImpl#getUser <em>User</em>}</li>
 *   <li>{@link org.eclipse.graphiti.examples.library.impl.BorrowedItemImpl#getBorrowDate <em>Borrow Date</em>}</li>
 *   <li>{@link org.eclipse.graphiti.examples.library.impl.BorrowedItemImpl#getLastReturnDate <em>Last Return Date</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BorrowedItemImpl extends EObjectImpl implements BorrowedItem {
	/**
	 * The cached value of the '{@link #getItem() <em>Item</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItem()
	 * @generated
	 * @ordered
	 */
	protected Book item;

	/**
	 * The default value of the '{@link #getBorrowDate() <em>Borrow Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBorrowDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date BORROW_DATE_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getBorrowDate() <em>Borrow Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBorrowDate()
	 * @generated
	 * @ordered
	 */
	protected Date borrowDate = BORROW_DATE_EDEFAULT;
	/**
	 * The default value of the '{@link #getLastReturnDate() <em>Last Return Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastReturnDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date LAST_RETURN_DATE_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getLastReturnDate() <em>Last Return Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastReturnDate()
	 * @generated
	 * @ordered
	 */
	protected Date lastReturnDate = LAST_RETURN_DATE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BorrowedItemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LibraryPackage.Literals.BORROWED_ITEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Book getItem() {
		if (item != null && item.eIsProxy()) {
			InternalEObject oldItem = (InternalEObject)item;
			item = (Book)eResolveProxy(oldItem);
			if (item != oldItem) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LibraryPackage.BORROWED_ITEM__ITEM, oldItem, item));
			}
		}
		return item;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Book basicGetItem() {
		return item;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setItem(Book newItem) {
		Book oldItem = item;
		item = newItem;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LibraryPackage.BORROWED_ITEM__ITEM, oldItem, item));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public User getUser() {
		if (eContainerFeatureID() != LibraryPackage.BORROWED_ITEM__USER) return null;
		return (User)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUser(User newUser, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newUser, LibraryPackage.BORROWED_ITEM__USER, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUser(User newUser) {
		if (newUser != eInternalContainer() || (eContainerFeatureID() != LibraryPackage.BORROWED_ITEM__USER && newUser != null)) {
			if (EcoreUtil.isAncestor(this, newUser))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newUser != null)
				msgs = ((InternalEObject)newUser).eInverseAdd(this, LibraryPackage.USER__BORROWED_ITEMS, User.class, msgs);
			msgs = basicSetUser(newUser, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LibraryPackage.BORROWED_ITEM__USER, newUser, newUser));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getBorrowDate() {
		return borrowDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBorrowDate(Date newBorrowDate) {
		Date oldBorrowDate = borrowDate;
		borrowDate = newBorrowDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LibraryPackage.BORROWED_ITEM__BORROW_DATE, oldBorrowDate, borrowDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getLastReturnDate() {
		return lastReturnDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLastReturnDate(Date newLastReturnDate) {
		Date oldLastReturnDate = lastReturnDate;
		lastReturnDate = newLastReturnDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LibraryPackage.BORROWED_ITEM__LAST_RETURN_DATE, oldLastReturnDate, lastReturnDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LibraryPackage.BORROWED_ITEM__USER:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetUser((User)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LibraryPackage.BORROWED_ITEM__USER:
				return basicSetUser(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case LibraryPackage.BORROWED_ITEM__USER:
				return eInternalContainer().eInverseRemove(this, LibraryPackage.USER__BORROWED_ITEMS, User.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LibraryPackage.BORROWED_ITEM__ITEM:
				if (resolve) return getItem();
				return basicGetItem();
			case LibraryPackage.BORROWED_ITEM__USER:
				return getUser();
			case LibraryPackage.BORROWED_ITEM__BORROW_DATE:
				return getBorrowDate();
			case LibraryPackage.BORROWED_ITEM__LAST_RETURN_DATE:
				return getLastReturnDate();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case LibraryPackage.BORROWED_ITEM__ITEM:
				setItem((Book)newValue);
				return;
			case LibraryPackage.BORROWED_ITEM__USER:
				setUser((User)newValue);
				return;
			case LibraryPackage.BORROWED_ITEM__BORROW_DATE:
				setBorrowDate((Date)newValue);
				return;
			case LibraryPackage.BORROWED_ITEM__LAST_RETURN_DATE:
				setLastReturnDate((Date)newValue);
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
	public void eUnset(int featureID) {
		switch (featureID) {
			case LibraryPackage.BORROWED_ITEM__ITEM:
				setItem((Book)null);
				return;
			case LibraryPackage.BORROWED_ITEM__USER:
				setUser((User)null);
				return;
			case LibraryPackage.BORROWED_ITEM__BORROW_DATE:
				setBorrowDate(BORROW_DATE_EDEFAULT);
				return;
			case LibraryPackage.BORROWED_ITEM__LAST_RETURN_DATE:
				setLastReturnDate(LAST_RETURN_DATE_EDEFAULT);
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case LibraryPackage.BORROWED_ITEM__ITEM:
				return item != null;
			case LibraryPackage.BORROWED_ITEM__USER:
				return getUser() != null;
			case LibraryPackage.BORROWED_ITEM__BORROW_DATE:
				return BORROW_DATE_EDEFAULT == null ? borrowDate != null : !BORROW_DATE_EDEFAULT.equals(borrowDate);
			case LibraryPackage.BORROWED_ITEM__LAST_RETURN_DATE:
				return LAST_RETURN_DATE_EDEFAULT == null ? lastReturnDate != null : !LAST_RETURN_DATE_EDEFAULT.equals(lastReturnDate);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (borrowDate: ");
		result.append(borrowDate);
		result.append(", lastReturnDate: ");
		result.append(lastReturnDate);
		result.append(')');
		return result.toString();
	}

} //BorrowedItemImpl
