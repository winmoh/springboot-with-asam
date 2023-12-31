/*
 * generated by Xtext 2.33.0
 */
package org.xtext.example.asam.ide.contentassist.antlr;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import org.xtext.example.asam.ide.contentassist.antlr.internal.InternalAsamParser;
import org.xtext.example.asam.services.AsamGrammarAccess;

public class AsamParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(AsamGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, AsamGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getElementAccess().getAlternatives(), "rule__Element__Alternatives");
			builder.put(grammarAccess.getRepositoryMethodAccess().getAlternatives(), "rule__RepositoryMethod__Alternatives");
			builder.put(grammarAccess.getTypeAccess().getAlternatives(), "rule__Type__Alternatives");
			builder.put(grammarAccess.getRTypeAccess().getAlternatives(), "rule__RType__Alternatives");
			builder.put(grammarAccess.getVTypesAccess().getAlternatives(), "rule__VTypes__Alternatives");
			builder.put(grammarAccess.getHttpMethodsAccess().getAlternatives(), "rule__HttpMethods__Alternatives");
			builder.put(grammarAccess.getRDBMSAccess().getAlternatives(), "rule__RDBMS__Alternatives");
			builder.put(grammarAccess.getDbRelationsAccess().getAlternatives(), "rule__DbRelations__Alternatives");
			builder.put(grammarAccess.getSbootAccess().getGroup(), "rule__Sboot__Group__0");
			builder.put(grammarAccess.getRelationshipAccess().getGroup(), "rule__Relationship__Group__0");
			builder.put(grammarAccess.getConfigurationAccess().getGroup(), "rule__Configuration__Group__0");
			builder.put(grammarAccess.getServerInfoAccess().getGroup(), "rule__ServerInfo__Group__0");
			builder.put(grammarAccess.getServerInfoAccess().getGroup_2(), "rule__ServerInfo__Group_2__0");
			builder.put(grammarAccess.getServerInfoAccess().getGroup_3(), "rule__ServerInfo__Group_3__0");
			builder.put(grammarAccess.getDatabaseInfoAccess().getGroup(), "rule__DatabaseInfo__Group__0");
			builder.put(grammarAccess.getEntityAccess().getGroup(), "rule__Entity__Group__0");
			builder.put(grammarAccess.getEntityAccess().getGroup_2(), "rule__Entity__Group_2__0");
			builder.put(grammarAccess.getDTOAccess().getGroup(), "rule__DTO__Group__0");
			builder.put(grammarAccess.getServiceAccess().getGroup(), "rule__Service__Group__0");
			builder.put(grammarAccess.getControllerAccess().getGroup(), "rule__Controller__Group__0");
			builder.put(grammarAccess.getRepositoryAccess().getGroup(), "rule__Repository__Group__0");
			builder.put(grammarAccess.getFindByMethodAccess().getGroup(), "rule__FindByMethod__Group__0");
			builder.put(grammarAccess.getDeleteByMethodAccess().getGroup(), "rule__DeleteByMethod__Group__0");
			builder.put(grammarAccess.getCustomQueryMethodAccess().getGroup(), "rule__CustomQueryMethod__Group__0");
			builder.put(grammarAccess.getServiceActionAccess().getGroup(), "rule__ServiceAction__Group__0");
			builder.put(grammarAccess.getServiceActionAccess().getGroup_5(), "rule__ServiceAction__Group_5__0");
			builder.put(grammarAccess.getServiceActionAccess().getGroup_6(), "rule__ServiceAction__Group_6__0");
			builder.put(grammarAccess.getControllerActionAccess().getGroup(), "rule__ControllerAction__Group__0");
			builder.put(grammarAccess.getControllerActionAccess().getGroup_6(), "rule__ControllerAction__Group_6__0");
			builder.put(grammarAccess.getActionParameterAccess().getGroup(), "rule__ActionParameter__Group__0");
			builder.put(grammarAccess.getActionParameterAccess().getGroup_3(), "rule__ActionParameter__Group_3__0");
			builder.put(grammarAccess.getPropertyAccess().getGroup(), "rule__Property__Group__0");
			builder.put(grammarAccess.getPropertyAccess().getGroup_3(), "rule__Property__Group_3__0");
			builder.put(grammarAccess.getListTypeAccess().getGroup(), "rule__ListType__Group__0");
			builder.put(grammarAccess.getSetTypeAccess().getGroup(), "rule__SetType__Group__0");
			builder.put(grammarAccess.getSbootAccess().getNomAssignment_1(), "rule__Sboot__NomAssignment_1");
			builder.put(grammarAccess.getSbootAccess().getConfigurationAssignment_2(), "rule__Sboot__ConfigurationAssignment_2");
			builder.put(grammarAccess.getSbootAccess().getElementsAssignment_3(), "rule__Sboot__ElementsAssignment_3");
			builder.put(grammarAccess.getRelationshipAccess().getTypeAssignment_1(), "rule__Relationship__TypeAssignment_1");
			builder.put(grammarAccess.getRelationshipAccess().getSourceAssignment_3(), "rule__Relationship__SourceAssignment_3");
			builder.put(grammarAccess.getRelationshipAccess().getTargetAssignment_5(), "rule__Relationship__TargetAssignment_5");
			builder.put(grammarAccess.getConfigurationAccess().getServerAssignment_2(), "rule__Configuration__ServerAssignment_2");
			builder.put(grammarAccess.getConfigurationAccess().getDatabaseAssignment_3(), "rule__Configuration__DatabaseAssignment_3");
			builder.put(grammarAccess.getServerInfoAccess().getPortAssignment_2_1(), "rule__ServerInfo__PortAssignment_2_1");
			builder.put(grammarAccess.getServerInfoAccess().getPathAssignment_3_1(), "rule__ServerInfo__PathAssignment_3_1");
			builder.put(grammarAccess.getDatabaseInfoAccess().getTypeAssignment_3(), "rule__DatabaseInfo__TypeAssignment_3");
			builder.put(grammarAccess.getDatabaseInfoAccess().getNomAssignment_5(), "rule__DatabaseInfo__NomAssignment_5");
			builder.put(grammarAccess.getDatabaseInfoAccess().getPortAssignment_7(), "rule__DatabaseInfo__PortAssignment_7");
			builder.put(grammarAccess.getDatabaseInfoAccess().getUsernameAssignment_9(), "rule__DatabaseInfo__UsernameAssignment_9");
			builder.put(grammarAccess.getDatabaseInfoAccess().getPasswordAssignment_11(), "rule__DatabaseInfo__PasswordAssignment_11");
			builder.put(grammarAccess.getEntityAccess().getNomAssignment_1(), "rule__Entity__NomAssignment_1");
			builder.put(grammarAccess.getEntityAccess().getExtendsAssignment_2_1(), "rule__Entity__ExtendsAssignment_2_1");
			builder.put(grammarAccess.getEntityAccess().getPropertiesAssignment_4(), "rule__Entity__PropertiesAssignment_4");
			builder.put(grammarAccess.getDTOAccess().getNomAssignment_1(), "rule__DTO__NomAssignment_1");
			builder.put(grammarAccess.getDTOAccess().getPropertiesAssignment_3(), "rule__DTO__PropertiesAssignment_3");
			builder.put(grammarAccess.getServiceAccess().getNomAssignment_1(), "rule__Service__NomAssignment_1");
			builder.put(grammarAccess.getServiceAccess().getEntityAssignment_3(), "rule__Service__EntityAssignment_3");
			builder.put(grammarAccess.getServiceAccess().getActionsAssignment_5(), "rule__Service__ActionsAssignment_5");
			builder.put(grammarAccess.getControllerAccess().getNomAssignment_1(), "rule__Controller__NomAssignment_1");
			builder.put(grammarAccess.getControllerAccess().getEntityAssignment_3(), "rule__Controller__EntityAssignment_3");
			builder.put(grammarAccess.getControllerAccess().getBaseUrlAssignment_5(), "rule__Controller__BaseUrlAssignment_5");
			builder.put(grammarAccess.getControllerAccess().getActionsAssignment_6(), "rule__Controller__ActionsAssignment_6");
			builder.put(grammarAccess.getRepositoryAccess().getNomAssignment_1(), "rule__Repository__NomAssignment_1");
			builder.put(grammarAccess.getRepositoryAccess().getEntityAssignment_3(), "rule__Repository__EntityAssignment_3");
			builder.put(grammarAccess.getRepositoryAccess().getMethodsAssignment_5(), "rule__Repository__MethodsAssignment_5");
			builder.put(grammarAccess.getFindByMethodAccess().getPropertyAssignment_2(), "rule__FindByMethod__PropertyAssignment_2");
			builder.put(grammarAccess.getFindByMethodAccess().getPropAssignment_4(), "rule__FindByMethod__PropAssignment_4");
			builder.put(grammarAccess.getDeleteByMethodAccess().getPropertyAssignment_2(), "rule__DeleteByMethod__PropertyAssignment_2");
			builder.put(grammarAccess.getDeleteByMethodAccess().getPropAssignment_4(), "rule__DeleteByMethod__PropAssignment_4");
			builder.put(grammarAccess.getCustomQueryMethodAccess().getQueryAssignment_2(), "rule__CustomQueryMethod__QueryAssignment_2");
			builder.put(grammarAccess.getServiceActionAccess().getNomAssignment_1(), "rule__ServiceAction__NomAssignment_1");
			builder.put(grammarAccess.getServiceActionAccess().getReturnTypeAssignment_4(), "rule__ServiceAction__ReturnTypeAssignment_4");
			builder.put(grammarAccess.getServiceActionAccess().getExceptionTypeAssignment_5_1(), "rule__ServiceAction__ExceptionTypeAssignment_5_1");
			builder.put(grammarAccess.getServiceActionAccess().getImplementationAssignment_6_1(), "rule__ServiceAction__ImplementationAssignment_6_1");
			builder.put(grammarAccess.getServiceActionAccess().getParametersAssignment_9(), "rule__ServiceAction__ParametersAssignment_9");
			builder.put(grammarAccess.getControllerActionAccess().getMethodAssignment_0(), "rule__ControllerAction__MethodAssignment_0");
			builder.put(grammarAccess.getControllerActionAccess().getNomAssignment_2(), "rule__ControllerAction__NomAssignment_2");
			builder.put(grammarAccess.getControllerActionAccess().getServiceActionAssignment_5(), "rule__ControllerAction__ServiceActionAssignment_5");
			builder.put(grammarAccess.getControllerActionAccess().getUrlAssignment_6_1(), "rule__ControllerAction__UrlAssignment_6_1");
			builder.put(grammarAccess.getControllerActionAccess().getParametersAssignment_7(), "rule__ControllerAction__ParametersAssignment_7");
			builder.put(grammarAccess.getActionParameterAccess().getNomAssignment_0(), "rule__ActionParameter__NomAssignment_0");
			builder.put(grammarAccess.getActionParameterAccess().getTypeAssignment_2(), "rule__ActionParameter__TypeAssignment_2");
			builder.put(grammarAccess.getActionParameterAccess().getDefaultValueAssignment_3_1(), "rule__ActionParameter__DefaultValueAssignment_3_1");
			builder.put(grammarAccess.getPropertyAccess().getNomAssignment_0(), "rule__Property__NomAssignment_0");
			builder.put(grammarAccess.getPropertyAccess().getTypeAssignment_2(), "rule__Property__TypeAssignment_2");
			builder.put(grammarAccess.getPropertyAccess().getDefaultValueAssignment_3_1(), "rule__Property__DefaultValueAssignment_3_1");
			builder.put(grammarAccess.getTypeAccess().getVtypesAssignment_0(), "rule__Type__VtypesAssignment_0");
			builder.put(grammarAccess.getRTypeAccess().getVypesAssignment_0(), "rule__RType__VypesAssignment_0");
			builder.put(grammarAccess.getListTypeAccess().getTypeAssignment_1(), "rule__ListType__TypeAssignment_1");
			builder.put(grammarAccess.getSetTypeAccess().getTypeAssignment_1(), "rule__SetType__TypeAssignment_1");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private AsamGrammarAccess grammarAccess;

	@Override
	protected InternalAsamParser createParser() {
		InternalAsamParser result = new InternalAsamParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		return nameMappings.getRuleName(element);
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public AsamGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(AsamGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}
