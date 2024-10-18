/*
 * generated by Xtext 2.33.0
 */
package org.xtext.example.asam.validation;

import java.util.HashSet;
import java.util.Set;

import org.eclipse.xtext.validation.Check;
import org.xtext.example.asam.asam.Entity;
import org.xtext.example.asam.asam.EntityRelationship;
import org.xtext.example.asam.asam.Property;
import org.xtext.example.asam.asam.Service;
import org.xtext.example.asam.asam.ServiceAction;
import org.xtext.example.asam.asam.AsamPackage;
import org.xtext.example.asam.asam.Controller;
import org.xtext.example.asam.asam.DatabaseInfo;



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
				error ( " cycle in hierarchy of entity" +current.getNom(),null );
			}
			vistedEntities.add(current);
			current=current.getExtends();
		}
	}
		
		@Check
		public void checkEntityNameStartsWithCapital(Entity entity) {
			
			if(Character.isLowerCase(entity.getNom().charAt(0))) {
				 warning("Entity name  should start with a capital",null);
			}
		}
		
		@Check
		public void checkAttributeNameStartsWithLowercase(Property prop) {
			
			if(!Character.isLowerCase(prop.getNom().charAt(0))) {
				 warning("Entity name  should start with a lower case",null);
			}
		}
		
		/*@Check
		public void checkControllerNameStartsWithCapital(Controller contr) {
			
			if(Character.isLowerCase(contr.getNom().charAt(0))) {
				 warning("Controller name  should start with a capital",null
			             );
			}
		}*/
		@Check
		public void checkEntityNameStartsWithCapital(Service serv) {
			
			if(Character.isLowerCase(serv.getNom().charAt(0))) {
				 warning("Entity name  should start with a capital",null
			                );
			}
		}
		@Check
		public void entityMustContainAtLeastOneAttribute(Entity ent) {
			if(ent.getProperties().size()==0) {
				warning("Entity must have at least one attribute",null);
				
			}
			
		}
		@Check
		public void realtionshipValidation(EntityRelationship relation) {
			if(relation.getSource()==null || relation.getTarget()==null) {
				warning("Realtionship require a source and a target",null);
				
			}
			if(relation.getTarget()==relation.getSource()) {
				error("Realtionship source and target must be different",null);

			}
			
		}
		/*@Check
		public void checkValidDatabasePort(DatabaseInfo database) {
		    if (database.getPort() < 1 || database.getPort() > 65535 ) {
		        error("Invalid database port, must be in the range 1-65535",null);
		    }
		}
		@Check*/
		public void checkUniquePropertyNames(Entity entity) {
		    Set<String> propertyNames = new HashSet<>();
		    for (Property property : entity.getProperties()) {
		        if (!propertyNames.add(property.getNom())) {
		            error("Duplicate property name within the entity",null);
		        }
		    }
		}
		
		@Check
		public void checkUniqueServiceActionNames(Service service) {
		    Set<String> actionNames = new HashSet<>();
		    for (ServiceAction action : service.getActions()) {
		        if (!actionNames.add(action.getNom())) {
		            error("Duplicate service action name within the service",null);
		        }
		    }
		}

		



		
		
		
		
		
}
	
	
	

