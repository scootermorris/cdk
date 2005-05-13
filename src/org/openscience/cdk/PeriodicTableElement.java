/*
 *  $RCSfile$
 *  $Author$
 *  $Date$
 *  $Revision$
 *
 *  Copyright (C) 2004  The Chemistry Development Kit (CDK) Project
 *
 *  Contact: cdk-devel@lists.sourceforge.net
 *
 *  This library is free software; you can redistribute it and/or
 *  modify it under the terms of the GNU Lesser General Public
 *  License as published by the Free Software Foundation; either
 *  version 2.1 of the License, or (at your option) any later version.
 *
 *  This library is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 *  Lesser General Public License for more details.
 *
 *  You should have received a copy of the GNU Lesser General Public
 *  License along with this library; if not, write to the Free Software
 *  Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA
 *  02111-1307  USA.
 */
package org.openscience.cdk;
import org.openscience.cdk.tools.LoggingTool;

/**
 * subclass of Elements for PeriodicTable.
 *
 * @author        Miguel Rojas
 * @cdk.created   May 8, 2005
 * @cdk.keyword   element
 * @cdk.module    core
 */
public class PeriodicTableElement extends Element
{
	
	private static LoggingTool logger;
	
	/** The name for this element. */
	protected String name;
	
	/** The chemical serie for this element. 
	*  A chemical series is a group of chemical elements whose physical and 
	*    chemical characteristics vary progressively from one end of the series 
	*    to another.
	*  Chemical series were discovered before the creation of the periodic 
	*    table of the chemical elements, which was created to try to organise 
	*    the elements according to their chemical properties. 
	*/
	protected String chemicalSerie;
	
	/** The period which this element belong. 
	*  In the periodic table of the elements, a period is a row of the table.
	*/
	protected String period;
	
	/** The group which this element belong.
	*  In the periodic table of the elements, a period is a row of the table.
	*  the elements in a same group have similar configurations of the outermost 
  	*    electron shells of their atoms
	*/
  	protected String group;
  	  
  	/** The phase which this element find.
  	*   In the physical sciences, a phase is a set of states of a macroscopic 
  	*    physical system that have relatively uniform chemical composition 
  	*    and physical properties.
  	*   Most familiar examples of phases are solids, liquids, and gases
  	*/
  	protected String phase;
   	 
   	/** 
	*   The CAS (Chemical Abstracts Service) number which this element has.
   	*/
    	protected String casId;
    
    
	/**
	 *  Constructor for the PeriodicTableElement object
	 */
	public PeriodicTableElement(String symbol)
	{
		this.symbol = symbol;
		logger = new LoggingTool(this);
	}
	/**
	* Returns the name of this element.
	*
	* @return The name of this element. Null if unset.
	*
	* @see    #setName
	*/
	public String getName() 
	{
		return this.name;
	}

	/**
	* Sets the name of this element.
	*
	* @param name The name to be assigned to this element
	*
	* @see    #getName
	*/
	public void setName(String name) 
	{
		this.name = name;
		notifyChanged();
	}

	/**
	* Returns the chemical serie of this element.
	*
	* @return The chemical serie of this element. Null if unset.
	*
	* @see    #setChemicalSerie
	*/
	public String getChemicalSerie() 
	{
		return this.chemicalSerie;
	}

	/**
	* Sets the chemical serie of this element.
	*
	* @param chemicalSerie The chemical serie to be assigned to this element
	*
	* @see    #getChemicalSerie
	*/
	public void setChemicalSerie(String chemicalSerie) 
	{
		this.chemicalSerie = chemicalSerie;
		notifyChanged();
	}

	/**
	* Returns the period which this element belongs.
	* 
	* @return The period of this element. Null if unset.
	*
	* @see    #setPeriod
	*/
	public String getPeriod() 
	{
		return this.period;
	}
	
	/**
	* Sets the chemical serie of this element.
	*
	* @param period The period to be assigned to this element
	*
	* @see    #getPeriod
	*/
	public void setPeriod(String period) 
	{
		this.period = period;
		notifyChanged();
	}
	
	/**
	* Returns the Group which this element belongs.
	* 
	* @return The group of this element. Null if unset.
	*
	* @see    #setGroup
	*/
	public String getGroup() 
	{
		return this.group;
	}

	/**
	* Sets the group, which this element belongs.
	*
	* @param group The group to be assigned to this atom
	*
	* @see    #getGroup
	*/
	public void setGroup(String group) 
	{
		this.group = group;
		notifyChanged();
	}
	
	/**
	* Returns the phase which this element find.
	* 
	* @return The phase of this element. Null if unset.
	*
	* @see    #setPhase
	*/
	public String getPhase() 
	{
		return this.phase;
	}

	/**
	* Sets the phase, which this element finds.
	*
	* @param phase The phase to be assigned to this element
	*
	* @see    #getGroup
	*/
	public void setPhase(String  phase) 
	{
		this.phase = phase;
		notifyChanged();
	}
	
	/**
	* Returns the CAS (Chemical Abstracts Service), which this element has.
	* 
	* @return The CAS of this element. Null if unset.
	*
	* @see    #setCASid
	*/
	public String getCASid() 
	{
		return this.casId;
	}
	
	/**
	* Sets the CAS (Chemical Abstracts Service), which this element has.
	*
	* @param casId The CAS number to be assigned to this element
	*
	* @see    #getCASid
	*/
	public void setCASid(String  casId) 
	{
		this.casId = casId;
		notifyChanged();
	}

	/**
         * Clones this element object.
         *
         * @return  The cloned object   
         */
	 public Object clone() 
	 {
		 Object clone = null;
		 try {
			 clone = super.clone();
		 } catch (Exception exception) {
			 logger.debug(exception);
		 }
		 return clone;
	 }
	 /**
	 *  Configures an element. Finds the correct element type
	 *  by looking at the element symbol.
	 *
	 *@param  elementPT   The element of the Periodic Table to be configure
	 *@return element     The configured element
	 */
	 public static Element configure(PeriodicTableElement elementPT)
	 {
		Element element = new Element(elementPT.getSymbol());
		
		element.setSymbol(elementPT.getSymbol());
		element.setAtomicNumber(elementPT.getAtomicNumber());
		//element.setName(ElementInt.getName());
		//element.setChemicalSerie(ElementInt.getChemicalSerie());
		//element.setPeriod(ElementInt.getPeriod());
		//element.setGroup(ElementInt.getGroup());
		//element.setPhase(ElementInt.getPhase());
		//element.setCASid(ElementInt.getCASid());
		return element;
	}
    	/**
	*
	*@return resultString  String
	*/
	public String toString() 
	{
		StringBuffer resultString = new StringBuffer();
		resultString.append("PeriodicTableElement(");
		
		resultString.append(getSymbol());
		resultString.append(", AN:"); resultString.append(getAtomicNumber());
		resultString.append(", N:"); resultString.append(getName());
		resultString.append(", CS:"); resultString.append(getChemicalSerie());
		resultString.append(", P:"); resultString.append(getPeriod());
		resultString.append(", G:"); resultString.append(getGroup());
		resultString.append(", Ph:"); resultString.append(getPhase());
		resultString.append(", CAS:"); resultString.append(getCASid());
		
		resultString.append(")");
		return resultString.toString();
	}
}

