import { ValidationCategory, type ValidationAcceptor, type ValidationChecks } from 'langium';
import { type SbootAstType, type Person, Controller, Service, DTO } from './generated/ast.js';
import type { SbootServices } from './sboot-module.js';

/**
 * Register custom validation checks.
 */
export function registerValidationChecks(services: SbootServices) {
    const registry = services.validation.ValidationRegistry;
    const validator = services.validation.SbootValidator;
    const checks: ValidationChecks<SbootAstType> = {
        Entity: validator.checkEntityAttributes,
        Controller:  validator.checkController,
        Service: validator.checkService,
        DTO: validator.CheckDto,
        ControllerAction: validator.checkConfiguration,
        ServerInfo: validator.checkServiceInfo,
        DatabaseInfo: validator.checkDatabaseInfo
        
        


    };
    registry.register(checks, validator);
}

/**
 * Implementation of custom validations.
 */
export class SbootValidator {
    checkDatabaseInfo(){}
    checkServiceInfo(){}
    checkConfiguration(){

    }
    checkController(){}
    checkService(){
        
    }
    CheckDto(){}
    checkEntityAttributes(){

    }

    /*checkPersonStartsWithCapital(person: Person, accept: ValidationAcceptor): void {
        if (person.name) {
            const firstChar = person.name.substring(0, 1);
            if (firstChar.toUpperCase() !== firstChar) {
                accept('warning', 'Person name should start with a capital.', { node: person, property: 'name' });
            }
        }
    }*/

}
