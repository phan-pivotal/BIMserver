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

import org.bimserver.models.ifc2x3.IfcCsgPrimitive3D;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Right Circular Cone</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.bimserver.models.ifc2x3.IfcRightCircularCone#getHeight <em>Height</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3.IfcRightCircularCone#getHeightAsString <em>Height As String</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3.IfcRightCircularCone#getBottomRadius <em>Bottom Radius</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3.IfcRightCircularCone#getBottomRadiusAsString <em>Bottom Radius As String</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.bimserver.models.ifc2x3.Ifc2x3Package#getIfcRightCircularCone()
 * @model
 * @generated
 */
public interface IfcRightCircularCone extends IfcCsgPrimitive3D
{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = " (c) Copyright bimserver.org 2009\r\n Licensed under GNU GPLv3\r\n http://www.gnu.org/licenses/gpl-3.0.txt\r\n For more information mail to license@bimserver.org\r\n \r\n Bimserver.org is free software: you can redistribute it and/or modify \r\n it under the terms of the GNU General Public License as published by \r\n the Free Software Foundation, either version 3 of the License, or\r\n (at your option) any later version.\r\n \r\n Bimserver.org is distributed in the hope that it will be useful, but \r\n WITHOUT ANY WARRANTY; without even the implied warranty of \r\n MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU \r\n General Public License for more details.\r\n \r\n You should have received a copy of the GNU General Public License a \r\n long with Bimserver.org . If not, see <http://www.gnu.org/licenses/>.";

	/**
	 * Returns the value of the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Height</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Height</em>' attribute.
	 * @see #setHeight(float)
	 * @see org.bimserver.models.ifc2x3.Ifc2x3Package#getIfcRightCircularCone_Height()
	 * @model
	 * @generated
	 */
	float getHeight();

	/**
	 * Sets the value of the '{@link org.bimserver.models.ifc2x3.IfcRightCircularCone#getHeight <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Height</em>' attribute.
	 * @see #getHeight()
	 * @generated
	 */
	void setHeight(float value);

	/**
	 * Returns the value of the '<em><b>Height As String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Height As String</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Height As String</em>' attribute.
	 * @see #setHeightAsString(String)
	 * @see org.bimserver.models.ifc2x3.Ifc2x3Package#getIfcRightCircularCone_HeightAsString()
	 * @model
	 * @generated
	 */
	String getHeightAsString();

	/**
	 * Sets the value of the '{@link org.bimserver.models.ifc2x3.IfcRightCircularCone#getHeightAsString <em>Height As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Height As String</em>' attribute.
	 * @see #getHeightAsString()
	 * @generated
	 */
	void setHeightAsString(String value);

	/**
	 * Returns the value of the '<em><b>Bottom Radius</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bottom Radius</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bottom Radius</em>' attribute.
	 * @see #setBottomRadius(float)
	 * @see org.bimserver.models.ifc2x3.Ifc2x3Package#getIfcRightCircularCone_BottomRadius()
	 * @model
	 * @generated
	 */
	float getBottomRadius();

	/**
	 * Sets the value of the '{@link org.bimserver.models.ifc2x3.IfcRightCircularCone#getBottomRadius <em>Bottom Radius</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bottom Radius</em>' attribute.
	 * @see #getBottomRadius()
	 * @generated
	 */
	void setBottomRadius(float value);

	/**
	 * Returns the value of the '<em><b>Bottom Radius As String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bottom Radius As String</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bottom Radius As String</em>' attribute.
	 * @see #setBottomRadiusAsString(String)
	 * @see org.bimserver.models.ifc2x3.Ifc2x3Package#getIfcRightCircularCone_BottomRadiusAsString()
	 * @model
	 * @generated
	 */
	String getBottomRadiusAsString();

	/**
	 * Sets the value of the '{@link org.bimserver.models.ifc2x3.IfcRightCircularCone#getBottomRadiusAsString <em>Bottom Radius As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bottom Radius As String</em>' attribute.
	 * @see #getBottomRadiusAsString()
	 * @generated
	 */
	void setBottomRadiusAsString(String value);

} // IfcRightCircularCone
