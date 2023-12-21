import type { ValidationAcceptor, ValidationChecks } from 'langium';
import type { SbootAstType, Person } from './generated/ast.js';
import type { SbootServices } from './sboot-module.js';

/**
 * Register custom validation checks.
 */
export function registerValidationChecks(services: SbootServices) {
    const registry = services.validation.ValidationRegistry;
    const validator = services.validation.SbootValidator;
    const checks: ValidationChecks<SbootAstType> = {
        Person: validator.checkPersonStartsWithCapital
    };
    registry.register(checks, validator);
}

/**
 * Implementation of custom validations.
 */
export class SbootValidator {

    checkPersonStartsWithCapital(person: Person, accept: ValidationAcceptor): void {
        if (person.name) {
            const firstChar = person.name.substring(0, 1);
            if (firstChar.toUpperCase() !== firstChar) {
                accept('warning', 'Person name should start with a capital.', { node: person, property: 'name' });
            }
        }
    }

}
