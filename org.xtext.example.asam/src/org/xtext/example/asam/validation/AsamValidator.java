/*
 * generated by Xtext 2.33.0
 */
package org.xtext.example.asam.validation;

import java.util.HashSet;

import org.eclipse.xtext.validation.Check;
import org.xtext.example.asam.asam.Entity;
import org.xtext.example.asam.asam.Property;
import org.xtext.example.asam.asam.Service;
import org.xtext.example.asam.asam.AsamPackage;
import org.xtext.example.asam.asam.Controller;


/**
 * This class contains custom validation rules. 
 *
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
public class AsamValidator extends AbstractAsamValidator {
	
//	public static final String INVALID_NAME = "invalidName";
//
//	@Check
//	public void checkGreetingStartsWithCapital(Greeting greeting) {
//		if (!Character.isUpperCase(greeting.getName().charAt(0))) {
//			warning("Name should start with a capital",
//					AsamPackage.Literals.GREETING__NAME,
//					INVALID_NAME);
//		}
//	}

	@Check
	 public void  checkNoCycleInEntityHierarchy(Entity entity) {
		if(entity.getExtends()==null) {
			
			
		}
		HashSet<Entity> vistedEntities=new HashSet<Entity>();
		Entity current =entity.getExtends();
		while(current!=null) {
			if(vistedEntities.contains(current)) {
				error ( " cycle in hierarchy of entity" +current.getNom() , AsamPackage.eINSTANCE.getEntity_Extends());
			}
			vistedEntities.add(current);
			current=current.getExtends();
		}
	}
		
		@Check
		public void checkEntityNameStartsWithCapital(Entity entity) {
			
			if(Character.isLowerCase(entity.getNom().charAt(0))) {
				 warning("Entity name  should start with a capital", 
			                AsamPackage.Literals.ELEMENT__NOM);
			}
		}
		
		@Check
		public void checkAttributeNameStartsWithLowercase(Property prop) {
			
			if(!Character.isLowerCase(prop.getNom().charAt(0))) {
				 warning("Entity name  should start with a lower case", 
			                AsamPackage.Literals.ELEMENT__NOM);
			}
		}
		
		@Check
		public void checkControllerNameStartsWithCapital(Controller contr) {
			
			if(Character.isLowerCase(contr.getNom().charAt(0))) {
				 warning("Controller name  should start with a capital", 
			                AsamPackage.Literals.ELEMENT__NOM);
			}
		}
		@Check
		public void checkEntityNameStartsWithCapital(Service serv) {
			
			if(Character.isLowerCase(serv.getNom().charAt(0))) {
				 warning("Entity name  should start with a capital", 
			                AsamPackage.Literals.ELEMENT__NOM);
			}
		}
		
		
		
		
	}
	
	
	

