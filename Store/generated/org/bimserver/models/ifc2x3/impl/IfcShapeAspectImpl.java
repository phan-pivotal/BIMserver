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
package org.bimserver.models.ifc2x3.impl;

import org.bimserver.emf.IdEObjectImpl;

import org.bimserver.models.ifc2x3.Ifc2x3Package;
import org.bimserver.models.ifc2x3.IfcProductDefinitionShape;
import org.bimserver.models.ifc2x3.IfcShapeAspect;
import org.bimserver.models.ifc2x3.IfcShapeModel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Shape Aspect</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.bimserver.models.ifc2x3.impl.IfcShapeAspectImpl#getShapeRepresentations <em>Shape Representations</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3.impl.IfcShapeAspectImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3.impl.IfcShapeAspectImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3.impl.IfcShapeAspectImpl#isProductDefinitional <em>Product Definitional</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3.impl.IfcShapeAspectImpl#getPartOfProductDefinitionShape <em>Part Of Product Definition Shape</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcShapeAspectImpl extends IdEObjectImpl implements IfcShapeAspect
{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = " (c) Copyright bimserver.org 2009\r\n Licensed under GNU GPLv3\r\n http://www.gnu.org/licenses/gpl-3.0.txt\r\n For more information mail to license@bimserver.org\r\n \r\n Bimserver.org is free software: you can redistribute it and/or modify \r\n it under the terms of the GNU General Public License as published by \r\n the Free Software Foundation, either version 3 of the License, or\r\n (at your option) any later version.\r\n \r\n Bimserver.org is distributed in the hope that it will be useful, but \r\n WITHOUT ANY WARRANTY; without even the implied warranty of \r\n MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU \r\n General Public License for more details.\r\n \r\n You should have received a copy of the GNU General Public License a \r\n long with Bimserver.org . If not, see <http://www.gnu.org/licenses/>.";

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcShapeAspectImpl()
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
		return Ifc2x3Package.Literals.IFC_SHAPE_ASPECT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected int eStaticFeatureCount()
	{
		return 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<IfcShapeModel> getShapeRepresentations()
	{
		return (EList<IfcShapeModel>)eGet(Ifc2x3Package.Literals.IFC_SHAPE_ASPECT__SHAPE_REPRESENTATIONS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName()
	{
		return (String)eGet(Ifc2x3Package.Literals.IFC_SHAPE_ASPECT__NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName)
	{
		eSet(Ifc2x3Package.Literals.IFC_SHAPE_ASPECT__NAME, newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetName()
	{
		eUnset(Ifc2x3Package.Literals.IFC_SHAPE_ASPECT__NAME);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetName()
	{
		return eIsSet(Ifc2x3Package.Literals.IFC_SHAPE_ASPECT__NAME);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription()
	{
		return (String)eGet(Ifc2x3Package.Literals.IFC_SHAPE_ASPECT__DESCRIPTION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription)
	{
		eSet(Ifc2x3Package.Literals.IFC_SHAPE_ASPECT__DESCRIPTION, newDescription);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDescription()
	{
		eUnset(Ifc2x3Package.Literals.IFC_SHAPE_ASPECT__DESCRIPTION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDescription()
	{
		return eIsSet(Ifc2x3Package.Literals.IFC_SHAPE_ASPECT__DESCRIPTION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isProductDefinitional()
	{
		return (Boolean)eGet(Ifc2x3Package.Literals.IFC_SHAPE_ASPECT__PRODUCT_DEFINITIONAL, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProductDefinitional(boolean newProductDefinitional)
	{
		eSet(Ifc2x3Package.Literals.IFC_SHAPE_ASPECT__PRODUCT_DEFINITIONAL, newProductDefinitional);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcProductDefinitionShape getPartOfProductDefinitionShape()
	{
		return (IfcProductDefinitionShape)eGet(Ifc2x3Package.Literals.IFC_SHAPE_ASPECT__PART_OF_PRODUCT_DEFINITION_SHAPE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPartOfProductDefinitionShape(IfcProductDefinitionShape newPartOfProductDefinitionShape)
	{
		eSet(Ifc2x3Package.Literals.IFC_SHAPE_ASPECT__PART_OF_PRODUCT_DEFINITION_SHAPE, newPartOfProductDefinitionShape);
	}

} //IfcShapeAspectImpl
