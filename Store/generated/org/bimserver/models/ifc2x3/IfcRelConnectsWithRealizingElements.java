/**
 *  (c) Copyright bimserver.org 2009
 *  Licensed under GNU GPLv3
 *  http://www.gnu.org/licenses/gpl-3.0.txt
 *  For more information mail to license@bimserver.org
 *  
 *  Bimserver.org is free software: you can redistribute it and/or modify 
 *  it under the terms of the GNU General Public License as published by 
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *  
 *  Bimserver.org is distributed in the hope that it will be useful, but 
 *  WITHOUT ANY WARRANTY; without even the implied warranty of 
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU 
 *  General Public License for more details.
 *  
 *  You should have received a copy of the GNU General Public License a 
 *  long with Bimserver.org . If not, see <http://www.gnu.org/licenses/>.
 */
package org.bimserver.models.ifc2x3;

import org.bimserver.models.ifc2x3.IfcElement;
import org.bimserver.models.ifc2x3.IfcRelConnectsElements;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Rel Connects With Realizing Elements</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.bimserver.models.ifc2x3.IfcRelConnectsWithRealizingElements#getRealizingElements <em>Realizing Elements</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3.IfcRelConnectsWithRealizingElements#getConnectionType <em>Connection Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.bimserver.models.ifc2x3.Ifc2x3Package#getIfcRelConnectsWithRealizingElements()
 * @model
 * @generated
 */
public interface IfcRelConnectsWithRealizingElements extends IfcRelConnectsElements
{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = " (c) Copyright bimserver.org 2009\r\n Licensed under GNU GPLv3\r\n http://www.gnu.org/licenses/gpl-3.0.txt\r\n For more information mail to license@bimserver.org\r\n \r\n Bimserver.org is free software: you can redistribute it and/or modify \r\n it under the terms of the GNU General Public License as published by \r\n the Free Software Foundation, either version 3 of the License, or\r\n (at your option) any later version.\r\n \r\n Bimserver.org is distributed in the hope that it will be useful, but \r\n WITHOUT ANY WARRANTY; without even the implied warranty of \r\n MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU \r\n General Public License for more details.\r\n \r\n You should have received a copy of the GNU General Public License a \r\n long with Bimserver.org . If not, see <http://www.gnu.org/licenses/>.";

	/**
	 * Returns the value of the '<em><b>Realizing Elements</b></em>' reference list.
	 * The list contents are of type {@link org.bimserver.models.ifc2x3.IfcElement}.
	 * It is bidirectional and its opposite is '{@link org.bimserver.models.ifc2x3.IfcElement#getIsConnectionRealization <em>Is Connection Realization</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Realizing Elements</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Realizing Elements</em>' reference list.
	 * @see org.bimserver.models.ifc2x3.Ifc2x3Package#getIfcRelConnectsWithRealizingElements_RealizingElements()
	 * @see org.bimserver.models.ifc2x3.IfcElement#getIsConnectionRealization
	 * @model opposite="IsConnectionRealization"
	 * @generated
	 */
	EList<IfcElement> getRealizingElements();

	/**
	 * Returns the value of the '<em><b>Connection Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connection Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connection Type</em>' attribute.
	 * @see #isSetConnectionType()
	 * @see #unsetConnectionType()
	 * @see #setConnectionType(String)
	 * @see org.bimserver.models.ifc2x3.Ifc2x3Package#getIfcRelConnectsWithRealizingElements_ConnectionType()
	 * @model unsettable="true"
	 * @generated
	 */
	String getConnectionType();

	/**
	 * Sets the value of the '{@link org.bimserver.models.ifc2x3.IfcRelConnectsWithRealizingElements#getConnectionType <em>Connection Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connection Type</em>' attribute.
	 * @see #isSetConnectionType()
	 * @see #unsetConnectionType()
	 * @see #getConnectionType()
	 * @generated
	 */
	void setConnectionType(String value);

	/**
	 * Unsets the value of the '{@link org.bimserver.models.ifc2x3.IfcRelConnectsWithRealizingElements#getConnectionType <em>Connection Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetConnectionType()
	 * @see #getConnectionType()
	 * @see #setConnectionType(String)
	 * @generated
	 */
	void unsetConnectionType();

	/**
	 * Returns whether the value of the '{@link org.bimserver.models.ifc2x3.IfcRelConnectsWithRealizingElements#getConnectionType <em>Connection Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Connection Type</em>' attribute is set.
	 * @see #unsetConnectionType()
	 * @see #getConnectionType()
	 * @see #setConnectionType(String)
	 * @generated
	 */
	boolean isSetConnectionType();

} // IfcRelConnectsWithRealizingElements
