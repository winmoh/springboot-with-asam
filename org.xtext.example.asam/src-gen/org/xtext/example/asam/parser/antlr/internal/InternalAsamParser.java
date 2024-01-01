package org.xtext.example.asam.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.asam.services.AsamGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalAsamParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_PATH", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'project'", "'relation'", "'between'", "'and'", "'config'", "'{'", "'}'", "'server'", "'port'", "'cpath'", "'database'", "'dbms'", "'dname'", "'dport'", "'username'", "'password'", "'entity'", "'inherits'", "'dto'", "'service'", "'pertainingTo'", "'controller'", "'mappingTo'", "'repository'", "'for'", "'find'", "'by'", "'And'", "'delete'", "'customQuery'", "'operation'", "'returns'", "'raises'", "'implementation'", "'params'", "'('", "')'", "'action'", "'linkedTo'", "'mappedAt'", "':'", "'default'", "'List<'", "'>'", "'Set<'", "'float'", "'long'", "'int'", "'char'", "'boolean'", "'byte'", "'String'", "'Get'", "'Delete'", "'Post'", "'Put'", "'Patch'", "'Mysql'", "'Postgres'", "'Mariadb'", "'h2'", "'Oracle'", "'ManyToMany'", "'ManyToOne'", "'OneToMany'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__59=59;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__55=55;
    public static final int T__12=12;
    public static final int T__56=56;
    public static final int T__13=13;
    public static final int T__57=57;
    public static final int T__14=14;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=4;
    public static final int RULE_PATH=6;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__23=23;
    public static final int T__67=67;
    public static final int T__24=24;
    public static final int T__68=68;
    public static final int T__25=25;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__20=20;
    public static final int T__64=64;
    public static final int T__21=21;
    public static final int T__65=65;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int RULE_STRING=7;
    public static final int RULE_SL_COMMENT=9;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__73=73;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__74=74;
    public static final int T__31=31;
    public static final int T__75=75;
    public static final int T__32=32;
    public static final int T__76=76;
    public static final int RULE_WS=10;
    public static final int RULE_ANY_OTHER=11;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalAsamParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalAsamParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalAsamParser.tokenNames; }
    public String getGrammarFileName() { return "InternalAsam.g"; }



     	private AsamGrammarAccess grammarAccess;

        public InternalAsamParser(TokenStream input, AsamGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Sboot";
       	}

       	@Override
       	protected AsamGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleSboot"
    // InternalAsam.g:65:1: entryRuleSboot returns [EObject current=null] : iv_ruleSboot= ruleSboot EOF ;
    public final EObject entryRuleSboot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSboot = null;


        try {
            // InternalAsam.g:65:46: (iv_ruleSboot= ruleSboot EOF )
            // InternalAsam.g:66:2: iv_ruleSboot= ruleSboot EOF
            {
             newCompositeNode(grammarAccess.getSbootRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSboot=ruleSboot();

            state._fsp--;

             current =iv_ruleSboot; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSboot"


    // $ANTLR start "ruleSboot"
    // InternalAsam.g:72:1: ruleSboot returns [EObject current=null] : (otherlv_0= 'project' ( (lv_nom_1_0= RULE_ID ) ) ( (lv_configuration_2_0= ruleConfiguration ) )? ( (lv_elements_3_0= ruleElement ) )* ) ;
    public final EObject ruleSboot() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_nom_1_0=null;
        EObject lv_configuration_2_0 = null;

        EObject lv_elements_3_0 = null;



        	enterRule();

        try {
            // InternalAsam.g:78:2: ( (otherlv_0= 'project' ( (lv_nom_1_0= RULE_ID ) ) ( (lv_configuration_2_0= ruleConfiguration ) )? ( (lv_elements_3_0= ruleElement ) )* ) )
            // InternalAsam.g:79:2: (otherlv_0= 'project' ( (lv_nom_1_0= RULE_ID ) ) ( (lv_configuration_2_0= ruleConfiguration ) )? ( (lv_elements_3_0= ruleElement ) )* )
            {
            // InternalAsam.g:79:2: (otherlv_0= 'project' ( (lv_nom_1_0= RULE_ID ) ) ( (lv_configuration_2_0= ruleConfiguration ) )? ( (lv_elements_3_0= ruleElement ) )* )
            // InternalAsam.g:80:3: otherlv_0= 'project' ( (lv_nom_1_0= RULE_ID ) ) ( (lv_configuration_2_0= ruleConfiguration ) )? ( (lv_elements_3_0= ruleElement ) )*
            {
            otherlv_0=(Token)match(input,12,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getSbootAccess().getProjectKeyword_0());
            		
            // InternalAsam.g:84:3: ( (lv_nom_1_0= RULE_ID ) )
            // InternalAsam.g:85:4: (lv_nom_1_0= RULE_ID )
            {
            // InternalAsam.g:85:4: (lv_nom_1_0= RULE_ID )
            // InternalAsam.g:86:5: lv_nom_1_0= RULE_ID
            {
            lv_nom_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_nom_1_0, grammarAccess.getSbootAccess().getNomIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSbootRule());
            					}
            					setWithLastConsumed(
            						current,
            						"nom",
            						lv_nom_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalAsam.g:102:3: ( (lv_configuration_2_0= ruleConfiguration ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==16) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalAsam.g:103:4: (lv_configuration_2_0= ruleConfiguration )
                    {
                    // InternalAsam.g:103:4: (lv_configuration_2_0= ruleConfiguration )
                    // InternalAsam.g:104:5: lv_configuration_2_0= ruleConfiguration
                    {

                    					newCompositeNode(grammarAccess.getSbootAccess().getConfigurationConfigurationParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_5);
                    lv_configuration_2_0=ruleConfiguration();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getSbootRule());
                    					}
                    					set(
                    						current,
                    						"configuration",
                    						lv_configuration_2_0,
                    						"org.xtext.example.asam.Asam.Configuration");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalAsam.g:121:3: ( (lv_elements_3_0= ruleElement ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==13||LA2_0==28||(LA2_0>=30 && LA2_0<=31)||LA2_0==33||LA2_0==35) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalAsam.g:122:4: (lv_elements_3_0= ruleElement )
            	    {
            	    // InternalAsam.g:122:4: (lv_elements_3_0= ruleElement )
            	    // InternalAsam.g:123:5: lv_elements_3_0= ruleElement
            	    {

            	    					newCompositeNode(grammarAccess.getSbootAccess().getElementsElementParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_5);
            	    lv_elements_3_0=ruleElement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getSbootRule());
            	    					}
            	    					add(
            	    						current,
            	    						"elements",
            	    						lv_elements_3_0,
            	    						"org.xtext.example.asam.Asam.Element");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSboot"


    // $ANTLR start "entryRuleElement"
    // InternalAsam.g:144:1: entryRuleElement returns [EObject current=null] : iv_ruleElement= ruleElement EOF ;
    public final EObject entryRuleElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElement = null;


        try {
            // InternalAsam.g:144:48: (iv_ruleElement= ruleElement EOF )
            // InternalAsam.g:145:2: iv_ruleElement= ruleElement EOF
            {
             newCompositeNode(grammarAccess.getElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleElement=ruleElement();

            state._fsp--;

             current =iv_ruleElement; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleElement"


    // $ANTLR start "ruleElement"
    // InternalAsam.g:151:1: ruleElement returns [EObject current=null] : (this_Entity_0= ruleEntity | this_Service_1= ruleService | this_Controller_2= ruleController | this_DTO_3= ruleDTO | this_Repository_4= ruleRepository | this_EntityRelationship_5= ruleEntityRelationship ) ;
    public final EObject ruleElement() throws RecognitionException {
        EObject current = null;

        EObject this_Entity_0 = null;

        EObject this_Service_1 = null;

        EObject this_Controller_2 = null;

        EObject this_DTO_3 = null;

        EObject this_Repository_4 = null;

        EObject this_EntityRelationship_5 = null;



        	enterRule();

        try {
            // InternalAsam.g:157:2: ( (this_Entity_0= ruleEntity | this_Service_1= ruleService | this_Controller_2= ruleController | this_DTO_3= ruleDTO | this_Repository_4= ruleRepository | this_EntityRelationship_5= ruleEntityRelationship ) )
            // InternalAsam.g:158:2: (this_Entity_0= ruleEntity | this_Service_1= ruleService | this_Controller_2= ruleController | this_DTO_3= ruleDTO | this_Repository_4= ruleRepository | this_EntityRelationship_5= ruleEntityRelationship )
            {
            // InternalAsam.g:158:2: (this_Entity_0= ruleEntity | this_Service_1= ruleService | this_Controller_2= ruleController | this_DTO_3= ruleDTO | this_Repository_4= ruleRepository | this_EntityRelationship_5= ruleEntityRelationship )
            int alt3=6;
            switch ( input.LA(1) ) {
            case 28:
                {
                alt3=1;
                }
                break;
            case 31:
                {
                alt3=2;
                }
                break;
            case 33:
                {
                alt3=3;
                }
                break;
            case 30:
                {
                alt3=4;
                }
                break;
            case 35:
                {
                alt3=5;
                }
                break;
            case 13:
                {
                alt3=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalAsam.g:159:3: this_Entity_0= ruleEntity
                    {

                    			newCompositeNode(grammarAccess.getElementAccess().getEntityParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Entity_0=ruleEntity();

                    state._fsp--;


                    			current = this_Entity_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalAsam.g:168:3: this_Service_1= ruleService
                    {

                    			newCompositeNode(grammarAccess.getElementAccess().getServiceParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Service_1=ruleService();

                    state._fsp--;


                    			current = this_Service_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalAsam.g:177:3: this_Controller_2= ruleController
                    {

                    			newCompositeNode(grammarAccess.getElementAccess().getControllerParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Controller_2=ruleController();

                    state._fsp--;


                    			current = this_Controller_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalAsam.g:186:3: this_DTO_3= ruleDTO
                    {

                    			newCompositeNode(grammarAccess.getElementAccess().getDTOParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_DTO_3=ruleDTO();

                    state._fsp--;


                    			current = this_DTO_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalAsam.g:195:3: this_Repository_4= ruleRepository
                    {

                    			newCompositeNode(grammarAccess.getElementAccess().getRepositoryParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_Repository_4=ruleRepository();

                    state._fsp--;


                    			current = this_Repository_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalAsam.g:204:3: this_EntityRelationship_5= ruleEntityRelationship
                    {

                    			newCompositeNode(grammarAccess.getElementAccess().getEntityRelationshipParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_EntityRelationship_5=ruleEntityRelationship();

                    state._fsp--;


                    			current = this_EntityRelationship_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleElement"


    // $ANTLR start "entryRuleEntityRelationship"
    // InternalAsam.g:216:1: entryRuleEntityRelationship returns [EObject current=null] : iv_ruleEntityRelationship= ruleEntityRelationship EOF ;
    public final EObject entryRuleEntityRelationship() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntityRelationship = null;


        try {
            // InternalAsam.g:216:59: (iv_ruleEntityRelationship= ruleEntityRelationship EOF )
            // InternalAsam.g:217:2: iv_ruleEntityRelationship= ruleEntityRelationship EOF
            {
             newCompositeNode(grammarAccess.getEntityRelationshipRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEntityRelationship=ruleEntityRelationship();

            state._fsp--;

             current =iv_ruleEntityRelationship; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEntityRelationship"


    // $ANTLR start "ruleEntityRelationship"
    // InternalAsam.g:223:1: ruleEntityRelationship returns [EObject current=null] : (otherlv_0= 'relation' ( (lv_type_1_0= ruledbRelations ) ) otherlv_2= 'between' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'and' ( (otherlv_5= RULE_ID ) ) ) ;
    public final EObject ruleEntityRelationship() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Enumerator lv_type_1_0 = null;



        	enterRule();

        try {
            // InternalAsam.g:229:2: ( (otherlv_0= 'relation' ( (lv_type_1_0= ruledbRelations ) ) otherlv_2= 'between' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'and' ( (otherlv_5= RULE_ID ) ) ) )
            // InternalAsam.g:230:2: (otherlv_0= 'relation' ( (lv_type_1_0= ruledbRelations ) ) otherlv_2= 'between' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'and' ( (otherlv_5= RULE_ID ) ) )
            {
            // InternalAsam.g:230:2: (otherlv_0= 'relation' ( (lv_type_1_0= ruledbRelations ) ) otherlv_2= 'between' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'and' ( (otherlv_5= RULE_ID ) ) )
            // InternalAsam.g:231:3: otherlv_0= 'relation' ( (lv_type_1_0= ruledbRelations ) ) otherlv_2= 'between' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'and' ( (otherlv_5= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,13,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getEntityRelationshipAccess().getRelationKeyword_0());
            		
            // InternalAsam.g:235:3: ( (lv_type_1_0= ruledbRelations ) )
            // InternalAsam.g:236:4: (lv_type_1_0= ruledbRelations )
            {
            // InternalAsam.g:236:4: (lv_type_1_0= ruledbRelations )
            // InternalAsam.g:237:5: lv_type_1_0= ruledbRelations
            {

            					newCompositeNode(grammarAccess.getEntityRelationshipAccess().getTypeDbRelationsEnumRuleCall_1_0());
            				
            pushFollow(FOLLOW_7);
            lv_type_1_0=ruledbRelations();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEntityRelationshipRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_1_0,
            						"org.xtext.example.asam.Asam.dbRelations");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,14,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getEntityRelationshipAccess().getBetweenKeyword_2());
            		
            // InternalAsam.g:258:3: ( (otherlv_3= RULE_ID ) )
            // InternalAsam.g:259:4: (otherlv_3= RULE_ID )
            {
            // InternalAsam.g:259:4: (otherlv_3= RULE_ID )
            // InternalAsam.g:260:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEntityRelationshipRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_8); 

            					newLeafNode(otherlv_3, grammarAccess.getEntityRelationshipAccess().getSourceEntityCrossReference_3_0());
            				

            }


            }

            otherlv_4=(Token)match(input,15,FOLLOW_3); 

            			newLeafNode(otherlv_4, grammarAccess.getEntityRelationshipAccess().getAndKeyword_4());
            		
            // InternalAsam.g:275:3: ( (otherlv_5= RULE_ID ) )
            // InternalAsam.g:276:4: (otherlv_5= RULE_ID )
            {
            // InternalAsam.g:276:4: (otherlv_5= RULE_ID )
            // InternalAsam.g:277:5: otherlv_5= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEntityRelationshipRule());
            					}
            				
            otherlv_5=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_5, grammarAccess.getEntityRelationshipAccess().getTargetEntityCrossReference_5_0());
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEntityRelationship"


    // $ANTLR start "entryRuleConfiguration"
    // InternalAsam.g:292:1: entryRuleConfiguration returns [EObject current=null] : iv_ruleConfiguration= ruleConfiguration EOF ;
    public final EObject entryRuleConfiguration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConfiguration = null;


        try {
            // InternalAsam.g:292:54: (iv_ruleConfiguration= ruleConfiguration EOF )
            // InternalAsam.g:293:2: iv_ruleConfiguration= ruleConfiguration EOF
            {
             newCompositeNode(grammarAccess.getConfigurationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConfiguration=ruleConfiguration();

            state._fsp--;

             current =iv_ruleConfiguration; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConfiguration"


    // $ANTLR start "ruleConfiguration"
    // InternalAsam.g:299:1: ruleConfiguration returns [EObject current=null] : (otherlv_0= 'config' otherlv_1= '{' ( (lv_server_2_0= ruleServerInfo ) )? ( (lv_database_3_0= ruleDatabaseInfo ) )? otherlv_4= '}' ) ;
    public final EObject ruleConfiguration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_4=null;
        EObject lv_server_2_0 = null;

        EObject lv_database_3_0 = null;



        	enterRule();

        try {
            // InternalAsam.g:305:2: ( (otherlv_0= 'config' otherlv_1= '{' ( (lv_server_2_0= ruleServerInfo ) )? ( (lv_database_3_0= ruleDatabaseInfo ) )? otherlv_4= '}' ) )
            // InternalAsam.g:306:2: (otherlv_0= 'config' otherlv_1= '{' ( (lv_server_2_0= ruleServerInfo ) )? ( (lv_database_3_0= ruleDatabaseInfo ) )? otherlv_4= '}' )
            {
            // InternalAsam.g:306:2: (otherlv_0= 'config' otherlv_1= '{' ( (lv_server_2_0= ruleServerInfo ) )? ( (lv_database_3_0= ruleDatabaseInfo ) )? otherlv_4= '}' )
            // InternalAsam.g:307:3: otherlv_0= 'config' otherlv_1= '{' ( (lv_server_2_0= ruleServerInfo ) )? ( (lv_database_3_0= ruleDatabaseInfo ) )? otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,16,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getConfigurationAccess().getConfigKeyword_0());
            		
            otherlv_1=(Token)match(input,17,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getConfigurationAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalAsam.g:315:3: ( (lv_server_2_0= ruleServerInfo ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==19) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalAsam.g:316:4: (lv_server_2_0= ruleServerInfo )
                    {
                    // InternalAsam.g:316:4: (lv_server_2_0= ruleServerInfo )
                    // InternalAsam.g:317:5: lv_server_2_0= ruleServerInfo
                    {

                    					newCompositeNode(grammarAccess.getConfigurationAccess().getServerServerInfoParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_11);
                    lv_server_2_0=ruleServerInfo();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getConfigurationRule());
                    					}
                    					set(
                    						current,
                    						"server",
                    						lv_server_2_0,
                    						"org.xtext.example.asam.Asam.ServerInfo");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalAsam.g:334:3: ( (lv_database_3_0= ruleDatabaseInfo ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==22) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalAsam.g:335:4: (lv_database_3_0= ruleDatabaseInfo )
                    {
                    // InternalAsam.g:335:4: (lv_database_3_0= ruleDatabaseInfo )
                    // InternalAsam.g:336:5: lv_database_3_0= ruleDatabaseInfo
                    {

                    					newCompositeNode(grammarAccess.getConfigurationAccess().getDatabaseDatabaseInfoParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_12);
                    lv_database_3_0=ruleDatabaseInfo();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getConfigurationRule());
                    					}
                    					set(
                    						current,
                    						"database",
                    						lv_database_3_0,
                    						"org.xtext.example.asam.Asam.DatabaseInfo");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getConfigurationAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConfiguration"


    // $ANTLR start "entryRuleServerInfo"
    // InternalAsam.g:361:1: entryRuleServerInfo returns [EObject current=null] : iv_ruleServerInfo= ruleServerInfo EOF ;
    public final EObject entryRuleServerInfo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleServerInfo = null;


        try {
            // InternalAsam.g:361:51: (iv_ruleServerInfo= ruleServerInfo EOF )
            // InternalAsam.g:362:2: iv_ruleServerInfo= ruleServerInfo EOF
            {
             newCompositeNode(grammarAccess.getServerInfoRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleServerInfo=ruleServerInfo();

            state._fsp--;

             current =iv_ruleServerInfo; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleServerInfo"


    // $ANTLR start "ruleServerInfo"
    // InternalAsam.g:368:1: ruleServerInfo returns [EObject current=null] : (otherlv_0= 'server' otherlv_1= '{' (otherlv_2= 'port' ( (lv_port_3_0= RULE_INT ) ) )? (otherlv_4= 'cpath' ( (lv_path_5_0= RULE_PATH ) ) )? otherlv_6= '}' ) ;
    public final EObject ruleServerInfo() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_port_3_0=null;
        Token otherlv_4=null;
        Token lv_path_5_0=null;
        Token otherlv_6=null;


        	enterRule();

        try {
            // InternalAsam.g:374:2: ( (otherlv_0= 'server' otherlv_1= '{' (otherlv_2= 'port' ( (lv_port_3_0= RULE_INT ) ) )? (otherlv_4= 'cpath' ( (lv_path_5_0= RULE_PATH ) ) )? otherlv_6= '}' ) )
            // InternalAsam.g:375:2: (otherlv_0= 'server' otherlv_1= '{' (otherlv_2= 'port' ( (lv_port_3_0= RULE_INT ) ) )? (otherlv_4= 'cpath' ( (lv_path_5_0= RULE_PATH ) ) )? otherlv_6= '}' )
            {
            // InternalAsam.g:375:2: (otherlv_0= 'server' otherlv_1= '{' (otherlv_2= 'port' ( (lv_port_3_0= RULE_INT ) ) )? (otherlv_4= 'cpath' ( (lv_path_5_0= RULE_PATH ) ) )? otherlv_6= '}' )
            // InternalAsam.g:376:3: otherlv_0= 'server' otherlv_1= '{' (otherlv_2= 'port' ( (lv_port_3_0= RULE_INT ) ) )? (otherlv_4= 'cpath' ( (lv_path_5_0= RULE_PATH ) ) )? otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getServerInfoAccess().getServerKeyword_0());
            		
            otherlv_1=(Token)match(input,17,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getServerInfoAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalAsam.g:384:3: (otherlv_2= 'port' ( (lv_port_3_0= RULE_INT ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==20) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalAsam.g:385:4: otherlv_2= 'port' ( (lv_port_3_0= RULE_INT ) )
                    {
                    otherlv_2=(Token)match(input,20,FOLLOW_14); 

                    				newLeafNode(otherlv_2, grammarAccess.getServerInfoAccess().getPortKeyword_2_0());
                    			
                    // InternalAsam.g:389:4: ( (lv_port_3_0= RULE_INT ) )
                    // InternalAsam.g:390:5: (lv_port_3_0= RULE_INT )
                    {
                    // InternalAsam.g:390:5: (lv_port_3_0= RULE_INT )
                    // InternalAsam.g:391:6: lv_port_3_0= RULE_INT
                    {
                    lv_port_3_0=(Token)match(input,RULE_INT,FOLLOW_15); 

                    						newLeafNode(lv_port_3_0, grammarAccess.getServerInfoAccess().getPortINTTerminalRuleCall_2_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getServerInfoRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"port",
                    							lv_port_3_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalAsam.g:408:3: (otherlv_4= 'cpath' ( (lv_path_5_0= RULE_PATH ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==21) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalAsam.g:409:4: otherlv_4= 'cpath' ( (lv_path_5_0= RULE_PATH ) )
                    {
                    otherlv_4=(Token)match(input,21,FOLLOW_16); 

                    				newLeafNode(otherlv_4, grammarAccess.getServerInfoAccess().getCpathKeyword_3_0());
                    			
                    // InternalAsam.g:413:4: ( (lv_path_5_0= RULE_PATH ) )
                    // InternalAsam.g:414:5: (lv_path_5_0= RULE_PATH )
                    {
                    // InternalAsam.g:414:5: (lv_path_5_0= RULE_PATH )
                    // InternalAsam.g:415:6: lv_path_5_0= RULE_PATH
                    {
                    lv_path_5_0=(Token)match(input,RULE_PATH,FOLLOW_12); 

                    						newLeafNode(lv_path_5_0, grammarAccess.getServerInfoAccess().getPathPATHTerminalRuleCall_3_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getServerInfoRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"path",
                    							lv_path_5_0,
                    							"org.xtext.example.asam.Asam.PATH");
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getServerInfoAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleServerInfo"


    // $ANTLR start "entryRuleDatabaseInfo"
    // InternalAsam.g:440:1: entryRuleDatabaseInfo returns [EObject current=null] : iv_ruleDatabaseInfo= ruleDatabaseInfo EOF ;
    public final EObject entryRuleDatabaseInfo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDatabaseInfo = null;


        try {
            // InternalAsam.g:440:53: (iv_ruleDatabaseInfo= ruleDatabaseInfo EOF )
            // InternalAsam.g:441:2: iv_ruleDatabaseInfo= ruleDatabaseInfo EOF
            {
             newCompositeNode(grammarAccess.getDatabaseInfoRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDatabaseInfo=ruleDatabaseInfo();

            state._fsp--;

             current =iv_ruleDatabaseInfo; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDatabaseInfo"


    // $ANTLR start "ruleDatabaseInfo"
    // InternalAsam.g:447:1: ruleDatabaseInfo returns [EObject current=null] : (otherlv_0= 'database' otherlv_1= '{' otherlv_2= 'dbms' ( (lv_type_3_0= ruleRDBMS ) ) otherlv_4= 'dname' ( (lv_nom_5_0= RULE_ID ) ) otherlv_6= 'dport' ( (lv_port_7_0= RULE_INT ) ) otherlv_8= 'username' ( (lv_username_9_0= RULE_ID ) ) otherlv_10= 'password' ( (lv_password_11_0= RULE_ID ) ) otherlv_12= '}' ) ;
    public final EObject ruleDatabaseInfo() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token lv_nom_5_0=null;
        Token otherlv_6=null;
        Token lv_port_7_0=null;
        Token otherlv_8=null;
        Token lv_username_9_0=null;
        Token otherlv_10=null;
        Token lv_password_11_0=null;
        Token otherlv_12=null;
        Enumerator lv_type_3_0 = null;



        	enterRule();

        try {
            // InternalAsam.g:453:2: ( (otherlv_0= 'database' otherlv_1= '{' otherlv_2= 'dbms' ( (lv_type_3_0= ruleRDBMS ) ) otherlv_4= 'dname' ( (lv_nom_5_0= RULE_ID ) ) otherlv_6= 'dport' ( (lv_port_7_0= RULE_INT ) ) otherlv_8= 'username' ( (lv_username_9_0= RULE_ID ) ) otherlv_10= 'password' ( (lv_password_11_0= RULE_ID ) ) otherlv_12= '}' ) )
            // InternalAsam.g:454:2: (otherlv_0= 'database' otherlv_1= '{' otherlv_2= 'dbms' ( (lv_type_3_0= ruleRDBMS ) ) otherlv_4= 'dname' ( (lv_nom_5_0= RULE_ID ) ) otherlv_6= 'dport' ( (lv_port_7_0= RULE_INT ) ) otherlv_8= 'username' ( (lv_username_9_0= RULE_ID ) ) otherlv_10= 'password' ( (lv_password_11_0= RULE_ID ) ) otherlv_12= '}' )
            {
            // InternalAsam.g:454:2: (otherlv_0= 'database' otherlv_1= '{' otherlv_2= 'dbms' ( (lv_type_3_0= ruleRDBMS ) ) otherlv_4= 'dname' ( (lv_nom_5_0= RULE_ID ) ) otherlv_6= 'dport' ( (lv_port_7_0= RULE_INT ) ) otherlv_8= 'username' ( (lv_username_9_0= RULE_ID ) ) otherlv_10= 'password' ( (lv_password_11_0= RULE_ID ) ) otherlv_12= '}' )
            // InternalAsam.g:455:3: otherlv_0= 'database' otherlv_1= '{' otherlv_2= 'dbms' ( (lv_type_3_0= ruleRDBMS ) ) otherlv_4= 'dname' ( (lv_nom_5_0= RULE_ID ) ) otherlv_6= 'dport' ( (lv_port_7_0= RULE_INT ) ) otherlv_8= 'username' ( (lv_username_9_0= RULE_ID ) ) otherlv_10= 'password' ( (lv_password_11_0= RULE_ID ) ) otherlv_12= '}'
            {
            otherlv_0=(Token)match(input,22,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getDatabaseInfoAccess().getDatabaseKeyword_0());
            		
            otherlv_1=(Token)match(input,17,FOLLOW_17); 

            			newLeafNode(otherlv_1, grammarAccess.getDatabaseInfoAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,23,FOLLOW_18); 

            			newLeafNode(otherlv_2, grammarAccess.getDatabaseInfoAccess().getDbmsKeyword_2());
            		
            // InternalAsam.g:467:3: ( (lv_type_3_0= ruleRDBMS ) )
            // InternalAsam.g:468:4: (lv_type_3_0= ruleRDBMS )
            {
            // InternalAsam.g:468:4: (lv_type_3_0= ruleRDBMS )
            // InternalAsam.g:469:5: lv_type_3_0= ruleRDBMS
            {

            					newCompositeNode(grammarAccess.getDatabaseInfoAccess().getTypeRDBMSEnumRuleCall_3_0());
            				
            pushFollow(FOLLOW_19);
            lv_type_3_0=ruleRDBMS();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDatabaseInfoRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_3_0,
            						"org.xtext.example.asam.Asam.RDBMS");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,24,FOLLOW_3); 

            			newLeafNode(otherlv_4, grammarAccess.getDatabaseInfoAccess().getDnameKeyword_4());
            		
            // InternalAsam.g:490:3: ( (lv_nom_5_0= RULE_ID ) )
            // InternalAsam.g:491:4: (lv_nom_5_0= RULE_ID )
            {
            // InternalAsam.g:491:4: (lv_nom_5_0= RULE_ID )
            // InternalAsam.g:492:5: lv_nom_5_0= RULE_ID
            {
            lv_nom_5_0=(Token)match(input,RULE_ID,FOLLOW_20); 

            					newLeafNode(lv_nom_5_0, grammarAccess.getDatabaseInfoAccess().getNomIDTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDatabaseInfoRule());
            					}
            					setWithLastConsumed(
            						current,
            						"nom",
            						lv_nom_5_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_6=(Token)match(input,25,FOLLOW_14); 

            			newLeafNode(otherlv_6, grammarAccess.getDatabaseInfoAccess().getDportKeyword_6());
            		
            // InternalAsam.g:512:3: ( (lv_port_7_0= RULE_INT ) )
            // InternalAsam.g:513:4: (lv_port_7_0= RULE_INT )
            {
            // InternalAsam.g:513:4: (lv_port_7_0= RULE_INT )
            // InternalAsam.g:514:5: lv_port_7_0= RULE_INT
            {
            lv_port_7_0=(Token)match(input,RULE_INT,FOLLOW_21); 

            					newLeafNode(lv_port_7_0, grammarAccess.getDatabaseInfoAccess().getPortINTTerminalRuleCall_7_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDatabaseInfoRule());
            					}
            					setWithLastConsumed(
            						current,
            						"port",
            						lv_port_7_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_8=(Token)match(input,26,FOLLOW_3); 

            			newLeafNode(otherlv_8, grammarAccess.getDatabaseInfoAccess().getUsernameKeyword_8());
            		
            // InternalAsam.g:534:3: ( (lv_username_9_0= RULE_ID ) )
            // InternalAsam.g:535:4: (lv_username_9_0= RULE_ID )
            {
            // InternalAsam.g:535:4: (lv_username_9_0= RULE_ID )
            // InternalAsam.g:536:5: lv_username_9_0= RULE_ID
            {
            lv_username_9_0=(Token)match(input,RULE_ID,FOLLOW_22); 

            					newLeafNode(lv_username_9_0, grammarAccess.getDatabaseInfoAccess().getUsernameIDTerminalRuleCall_9_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDatabaseInfoRule());
            					}
            					setWithLastConsumed(
            						current,
            						"username",
            						lv_username_9_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_10=(Token)match(input,27,FOLLOW_3); 

            			newLeafNode(otherlv_10, grammarAccess.getDatabaseInfoAccess().getPasswordKeyword_10());
            		
            // InternalAsam.g:556:3: ( (lv_password_11_0= RULE_ID ) )
            // InternalAsam.g:557:4: (lv_password_11_0= RULE_ID )
            {
            // InternalAsam.g:557:4: (lv_password_11_0= RULE_ID )
            // InternalAsam.g:558:5: lv_password_11_0= RULE_ID
            {
            lv_password_11_0=(Token)match(input,RULE_ID,FOLLOW_12); 

            					newLeafNode(lv_password_11_0, grammarAccess.getDatabaseInfoAccess().getPasswordIDTerminalRuleCall_11_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDatabaseInfoRule());
            					}
            					setWithLastConsumed(
            						current,
            						"password",
            						lv_password_11_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_12=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_12, grammarAccess.getDatabaseInfoAccess().getRightCurlyBracketKeyword_12());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDatabaseInfo"


    // $ANTLR start "entryRuleEntity"
    // InternalAsam.g:582:1: entryRuleEntity returns [EObject current=null] : iv_ruleEntity= ruleEntity EOF ;
    public final EObject entryRuleEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntity = null;


        try {
            // InternalAsam.g:582:47: (iv_ruleEntity= ruleEntity EOF )
            // InternalAsam.g:583:2: iv_ruleEntity= ruleEntity EOF
            {
             newCompositeNode(grammarAccess.getEntityRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEntity=ruleEntity();

            state._fsp--;

             current =iv_ruleEntity; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEntity"


    // $ANTLR start "ruleEntity"
    // InternalAsam.g:589:1: ruleEntity returns [EObject current=null] : (otherlv_0= 'entity' ( (lv_nom_1_0= RULE_ID ) ) (otherlv_2= 'inherits' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_properties_5_0= ruleProperty ) )* otherlv_6= '}' ) ;
    public final EObject ruleEntity() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_nom_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_properties_5_0 = null;



        	enterRule();

        try {
            // InternalAsam.g:595:2: ( (otherlv_0= 'entity' ( (lv_nom_1_0= RULE_ID ) ) (otherlv_2= 'inherits' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_properties_5_0= ruleProperty ) )* otherlv_6= '}' ) )
            // InternalAsam.g:596:2: (otherlv_0= 'entity' ( (lv_nom_1_0= RULE_ID ) ) (otherlv_2= 'inherits' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_properties_5_0= ruleProperty ) )* otherlv_6= '}' )
            {
            // InternalAsam.g:596:2: (otherlv_0= 'entity' ( (lv_nom_1_0= RULE_ID ) ) (otherlv_2= 'inherits' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_properties_5_0= ruleProperty ) )* otherlv_6= '}' )
            // InternalAsam.g:597:3: otherlv_0= 'entity' ( (lv_nom_1_0= RULE_ID ) ) (otherlv_2= 'inherits' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_properties_5_0= ruleProperty ) )* otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,28,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getEntityAccess().getEntityKeyword_0());
            		
            // InternalAsam.g:601:3: ( (lv_nom_1_0= RULE_ID ) )
            // InternalAsam.g:602:4: (lv_nom_1_0= RULE_ID )
            {
            // InternalAsam.g:602:4: (lv_nom_1_0= RULE_ID )
            // InternalAsam.g:603:5: lv_nom_1_0= RULE_ID
            {
            lv_nom_1_0=(Token)match(input,RULE_ID,FOLLOW_23); 

            					newLeafNode(lv_nom_1_0, grammarAccess.getEntityAccess().getNomIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEntityRule());
            					}
            					setWithLastConsumed(
            						current,
            						"nom",
            						lv_nom_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalAsam.g:619:3: (otherlv_2= 'inherits' ( (otherlv_3= RULE_ID ) ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==29) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalAsam.g:620:4: otherlv_2= 'inherits' ( (otherlv_3= RULE_ID ) )
                    {
                    otherlv_2=(Token)match(input,29,FOLLOW_3); 

                    				newLeafNode(otherlv_2, grammarAccess.getEntityAccess().getInheritsKeyword_2_0());
                    			
                    // InternalAsam.g:624:4: ( (otherlv_3= RULE_ID ) )
                    // InternalAsam.g:625:5: (otherlv_3= RULE_ID )
                    {
                    // InternalAsam.g:625:5: (otherlv_3= RULE_ID )
                    // InternalAsam.g:626:6: otherlv_3= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEntityRule());
                    						}
                    					
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_9); 

                    						newLeafNode(otherlv_3, grammarAccess.getEntityAccess().getExtendsEntityCrossReference_2_1_0());
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,17,FOLLOW_24); 

            			newLeafNode(otherlv_4, grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalAsam.g:642:3: ( (lv_properties_5_0= ruleProperty ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_ID) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalAsam.g:643:4: (lv_properties_5_0= ruleProperty )
            	    {
            	    // InternalAsam.g:643:4: (lv_properties_5_0= ruleProperty )
            	    // InternalAsam.g:644:5: lv_properties_5_0= ruleProperty
            	    {

            	    					newCompositeNode(grammarAccess.getEntityAccess().getPropertiesPropertyParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_24);
            	    lv_properties_5_0=ruleProperty();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getEntityRule());
            	    					}
            	    					add(
            	    						current,
            	    						"properties",
            	    						lv_properties_5_0,
            	    						"org.xtext.example.asam.Asam.Property");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            otherlv_6=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEntity"


    // $ANTLR start "entryRuleDTO"
    // InternalAsam.g:669:1: entryRuleDTO returns [EObject current=null] : iv_ruleDTO= ruleDTO EOF ;
    public final EObject entryRuleDTO() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDTO = null;


        try {
            // InternalAsam.g:669:44: (iv_ruleDTO= ruleDTO EOF )
            // InternalAsam.g:670:2: iv_ruleDTO= ruleDTO EOF
            {
             newCompositeNode(grammarAccess.getDTORule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDTO=ruleDTO();

            state._fsp--;

             current =iv_ruleDTO; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDTO"


    // $ANTLR start "ruleDTO"
    // InternalAsam.g:676:1: ruleDTO returns [EObject current=null] : (otherlv_0= 'dto' ( (lv_nom_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_properties_3_0= ruleProperty ) )* otherlv_4= '}' ) ;
    public final EObject ruleDTO() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_nom_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_properties_3_0 = null;



        	enterRule();

        try {
            // InternalAsam.g:682:2: ( (otherlv_0= 'dto' ( (lv_nom_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_properties_3_0= ruleProperty ) )* otherlv_4= '}' ) )
            // InternalAsam.g:683:2: (otherlv_0= 'dto' ( (lv_nom_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_properties_3_0= ruleProperty ) )* otherlv_4= '}' )
            {
            // InternalAsam.g:683:2: (otherlv_0= 'dto' ( (lv_nom_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_properties_3_0= ruleProperty ) )* otherlv_4= '}' )
            // InternalAsam.g:684:3: otherlv_0= 'dto' ( (lv_nom_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_properties_3_0= ruleProperty ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,30,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getDTOAccess().getDtoKeyword_0());
            		
            // InternalAsam.g:688:3: ( (lv_nom_1_0= RULE_ID ) )
            // InternalAsam.g:689:4: (lv_nom_1_0= RULE_ID )
            {
            // InternalAsam.g:689:4: (lv_nom_1_0= RULE_ID )
            // InternalAsam.g:690:5: lv_nom_1_0= RULE_ID
            {
            lv_nom_1_0=(Token)match(input,RULE_ID,FOLLOW_9); 

            					newLeafNode(lv_nom_1_0, grammarAccess.getDTOAccess().getNomIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDTORule());
            					}
            					setWithLastConsumed(
            						current,
            						"nom",
            						lv_nom_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,17,FOLLOW_24); 

            			newLeafNode(otherlv_2, grammarAccess.getDTOAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalAsam.g:710:3: ( (lv_properties_3_0= ruleProperty ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_ID) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalAsam.g:711:4: (lv_properties_3_0= ruleProperty )
            	    {
            	    // InternalAsam.g:711:4: (lv_properties_3_0= ruleProperty )
            	    // InternalAsam.g:712:5: lv_properties_3_0= ruleProperty
            	    {

            	    					newCompositeNode(grammarAccess.getDTOAccess().getPropertiesPropertyParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_24);
            	    lv_properties_3_0=ruleProperty();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getDTORule());
            	    					}
            	    					add(
            	    						current,
            	    						"properties",
            	    						lv_properties_3_0,
            	    						"org.xtext.example.asam.Asam.Property");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            otherlv_4=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getDTOAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDTO"


    // $ANTLR start "entryRuleService"
    // InternalAsam.g:737:1: entryRuleService returns [EObject current=null] : iv_ruleService= ruleService EOF ;
    public final EObject entryRuleService() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleService = null;


        try {
            // InternalAsam.g:737:48: (iv_ruleService= ruleService EOF )
            // InternalAsam.g:738:2: iv_ruleService= ruleService EOF
            {
             newCompositeNode(grammarAccess.getServiceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleService=ruleService();

            state._fsp--;

             current =iv_ruleService; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleService"


    // $ANTLR start "ruleService"
    // InternalAsam.g:744:1: ruleService returns [EObject current=null] : (otherlv_0= 'service' ( (lv_nom_1_0= RULE_ID ) ) otherlv_2= 'pertainingTo' ( (otherlv_3= RULE_ID ) ) otherlv_4= '{' ( (lv_actions_5_0= ruleServiceAction ) )* otherlv_6= '}' ) ;
    public final EObject ruleService() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_nom_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_actions_5_0 = null;



        	enterRule();

        try {
            // InternalAsam.g:750:2: ( (otherlv_0= 'service' ( (lv_nom_1_0= RULE_ID ) ) otherlv_2= 'pertainingTo' ( (otherlv_3= RULE_ID ) ) otherlv_4= '{' ( (lv_actions_5_0= ruleServiceAction ) )* otherlv_6= '}' ) )
            // InternalAsam.g:751:2: (otherlv_0= 'service' ( (lv_nom_1_0= RULE_ID ) ) otherlv_2= 'pertainingTo' ( (otherlv_3= RULE_ID ) ) otherlv_4= '{' ( (lv_actions_5_0= ruleServiceAction ) )* otherlv_6= '}' )
            {
            // InternalAsam.g:751:2: (otherlv_0= 'service' ( (lv_nom_1_0= RULE_ID ) ) otherlv_2= 'pertainingTo' ( (otherlv_3= RULE_ID ) ) otherlv_4= '{' ( (lv_actions_5_0= ruleServiceAction ) )* otherlv_6= '}' )
            // InternalAsam.g:752:3: otherlv_0= 'service' ( (lv_nom_1_0= RULE_ID ) ) otherlv_2= 'pertainingTo' ( (otherlv_3= RULE_ID ) ) otherlv_4= '{' ( (lv_actions_5_0= ruleServiceAction ) )* otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,31,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getServiceAccess().getServiceKeyword_0());
            		
            // InternalAsam.g:756:3: ( (lv_nom_1_0= RULE_ID ) )
            // InternalAsam.g:757:4: (lv_nom_1_0= RULE_ID )
            {
            // InternalAsam.g:757:4: (lv_nom_1_0= RULE_ID )
            // InternalAsam.g:758:5: lv_nom_1_0= RULE_ID
            {
            lv_nom_1_0=(Token)match(input,RULE_ID,FOLLOW_25); 

            					newLeafNode(lv_nom_1_0, grammarAccess.getServiceAccess().getNomIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getServiceRule());
            					}
            					setWithLastConsumed(
            						current,
            						"nom",
            						lv_nom_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,32,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getServiceAccess().getPertainingToKeyword_2());
            		
            // InternalAsam.g:778:3: ( (otherlv_3= RULE_ID ) )
            // InternalAsam.g:779:4: (otherlv_3= RULE_ID )
            {
            // InternalAsam.g:779:4: (otherlv_3= RULE_ID )
            // InternalAsam.g:780:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getServiceRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_9); 

            					newLeafNode(otherlv_3, grammarAccess.getServiceAccess().getEntityControllerCrossReference_3_0());
            				

            }


            }

            otherlv_4=(Token)match(input,17,FOLLOW_26); 

            			newLeafNode(otherlv_4, grammarAccess.getServiceAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalAsam.g:795:3: ( (lv_actions_5_0= ruleServiceAction ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==42) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalAsam.g:796:4: (lv_actions_5_0= ruleServiceAction )
            	    {
            	    // InternalAsam.g:796:4: (lv_actions_5_0= ruleServiceAction )
            	    // InternalAsam.g:797:5: lv_actions_5_0= ruleServiceAction
            	    {

            	    					newCompositeNode(grammarAccess.getServiceAccess().getActionsServiceActionParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_26);
            	    lv_actions_5_0=ruleServiceAction();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getServiceRule());
            	    					}
            	    					add(
            	    						current,
            	    						"actions",
            	    						lv_actions_5_0,
            	    						"org.xtext.example.asam.Asam.ServiceAction");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            otherlv_6=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getServiceAccess().getRightCurlyBracketKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleService"


    // $ANTLR start "entryRuleController"
    // InternalAsam.g:822:1: entryRuleController returns [EObject current=null] : iv_ruleController= ruleController EOF ;
    public final EObject entryRuleController() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleController = null;


        try {
            // InternalAsam.g:822:51: (iv_ruleController= ruleController EOF )
            // InternalAsam.g:823:2: iv_ruleController= ruleController EOF
            {
             newCompositeNode(grammarAccess.getControllerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleController=ruleController();

            state._fsp--;

             current =iv_ruleController; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleController"


    // $ANTLR start "ruleController"
    // InternalAsam.g:829:1: ruleController returns [EObject current=null] : (otherlv_0= 'controller' ( (lv_nom_1_0= RULE_ID ) ) otherlv_2= 'mappingTo' ( (otherlv_3= RULE_ID ) ) otherlv_4= '{' ( (lv_baseUrl_5_0= RULE_STRING ) )? ( (lv_actions_6_0= ruleControllerAction ) )* otherlv_7= '}' ) ;
    public final EObject ruleController() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_nom_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_baseUrl_5_0=null;
        Token otherlv_7=null;
        EObject lv_actions_6_0 = null;



        	enterRule();

        try {
            // InternalAsam.g:835:2: ( (otherlv_0= 'controller' ( (lv_nom_1_0= RULE_ID ) ) otherlv_2= 'mappingTo' ( (otherlv_3= RULE_ID ) ) otherlv_4= '{' ( (lv_baseUrl_5_0= RULE_STRING ) )? ( (lv_actions_6_0= ruleControllerAction ) )* otherlv_7= '}' ) )
            // InternalAsam.g:836:2: (otherlv_0= 'controller' ( (lv_nom_1_0= RULE_ID ) ) otherlv_2= 'mappingTo' ( (otherlv_3= RULE_ID ) ) otherlv_4= '{' ( (lv_baseUrl_5_0= RULE_STRING ) )? ( (lv_actions_6_0= ruleControllerAction ) )* otherlv_7= '}' )
            {
            // InternalAsam.g:836:2: (otherlv_0= 'controller' ( (lv_nom_1_0= RULE_ID ) ) otherlv_2= 'mappingTo' ( (otherlv_3= RULE_ID ) ) otherlv_4= '{' ( (lv_baseUrl_5_0= RULE_STRING ) )? ( (lv_actions_6_0= ruleControllerAction ) )* otherlv_7= '}' )
            // InternalAsam.g:837:3: otherlv_0= 'controller' ( (lv_nom_1_0= RULE_ID ) ) otherlv_2= 'mappingTo' ( (otherlv_3= RULE_ID ) ) otherlv_4= '{' ( (lv_baseUrl_5_0= RULE_STRING ) )? ( (lv_actions_6_0= ruleControllerAction ) )* otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,33,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getControllerAccess().getControllerKeyword_0());
            		
            // InternalAsam.g:841:3: ( (lv_nom_1_0= RULE_ID ) )
            // InternalAsam.g:842:4: (lv_nom_1_0= RULE_ID )
            {
            // InternalAsam.g:842:4: (lv_nom_1_0= RULE_ID )
            // InternalAsam.g:843:5: lv_nom_1_0= RULE_ID
            {
            lv_nom_1_0=(Token)match(input,RULE_ID,FOLLOW_27); 

            					newLeafNode(lv_nom_1_0, grammarAccess.getControllerAccess().getNomIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getControllerRule());
            					}
            					setWithLastConsumed(
            						current,
            						"nom",
            						lv_nom_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,34,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getControllerAccess().getMappingToKeyword_2());
            		
            // InternalAsam.g:863:3: ( (otherlv_3= RULE_ID ) )
            // InternalAsam.g:864:4: (otherlv_3= RULE_ID )
            {
            // InternalAsam.g:864:4: (otherlv_3= RULE_ID )
            // InternalAsam.g:865:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getControllerRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_9); 

            					newLeafNode(otherlv_3, grammarAccess.getControllerAccess().getEntityEntityCrossReference_3_0());
            				

            }


            }

            otherlv_4=(Token)match(input,17,FOLLOW_28); 

            			newLeafNode(otherlv_4, grammarAccess.getControllerAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalAsam.g:880:3: ( (lv_baseUrl_5_0= RULE_STRING ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_STRING) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalAsam.g:881:4: (lv_baseUrl_5_0= RULE_STRING )
                    {
                    // InternalAsam.g:881:4: (lv_baseUrl_5_0= RULE_STRING )
                    // InternalAsam.g:882:5: lv_baseUrl_5_0= RULE_STRING
                    {
                    lv_baseUrl_5_0=(Token)match(input,RULE_STRING,FOLLOW_29); 

                    					newLeafNode(lv_baseUrl_5_0, grammarAccess.getControllerAccess().getBaseUrlSTRINGTerminalRuleCall_5_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getControllerRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"baseUrl",
                    						lv_baseUrl_5_0,
                    						"org.eclipse.xtext.common.Terminals.STRING");
                    				

                    }


                    }
                    break;

            }

            // InternalAsam.g:898:3: ( (lv_actions_6_0= ruleControllerAction ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>=64 && LA13_0<=68)) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalAsam.g:899:4: (lv_actions_6_0= ruleControllerAction )
            	    {
            	    // InternalAsam.g:899:4: (lv_actions_6_0= ruleControllerAction )
            	    // InternalAsam.g:900:5: lv_actions_6_0= ruleControllerAction
            	    {

            	    					newCompositeNode(grammarAccess.getControllerAccess().getActionsControllerActionParserRuleCall_6_0());
            	    				
            	    pushFollow(FOLLOW_29);
            	    lv_actions_6_0=ruleControllerAction();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getControllerRule());
            	    					}
            	    					add(
            	    						current,
            	    						"actions",
            	    						lv_actions_6_0,
            	    						"org.xtext.example.asam.Asam.ControllerAction");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            otherlv_7=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getControllerAccess().getRightCurlyBracketKeyword_7());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleController"


    // $ANTLR start "entryRuleRepository"
    // InternalAsam.g:925:1: entryRuleRepository returns [EObject current=null] : iv_ruleRepository= ruleRepository EOF ;
    public final EObject entryRuleRepository() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRepository = null;


        try {
            // InternalAsam.g:925:51: (iv_ruleRepository= ruleRepository EOF )
            // InternalAsam.g:926:2: iv_ruleRepository= ruleRepository EOF
            {
             newCompositeNode(grammarAccess.getRepositoryRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRepository=ruleRepository();

            state._fsp--;

             current =iv_ruleRepository; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRepository"


    // $ANTLR start "ruleRepository"
    // InternalAsam.g:932:1: ruleRepository returns [EObject current=null] : (otherlv_0= 'repository' ( (lv_nom_1_0= RULE_ID ) ) otherlv_2= 'for' ( (otherlv_3= RULE_ID ) ) otherlv_4= '{' ( (lv_methods_5_0= ruleRepositoryMethod ) )* otherlv_6= '}' ) ;
    public final EObject ruleRepository() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_nom_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_methods_5_0 = null;



        	enterRule();

        try {
            // InternalAsam.g:938:2: ( (otherlv_0= 'repository' ( (lv_nom_1_0= RULE_ID ) ) otherlv_2= 'for' ( (otherlv_3= RULE_ID ) ) otherlv_4= '{' ( (lv_methods_5_0= ruleRepositoryMethod ) )* otherlv_6= '}' ) )
            // InternalAsam.g:939:2: (otherlv_0= 'repository' ( (lv_nom_1_0= RULE_ID ) ) otherlv_2= 'for' ( (otherlv_3= RULE_ID ) ) otherlv_4= '{' ( (lv_methods_5_0= ruleRepositoryMethod ) )* otherlv_6= '}' )
            {
            // InternalAsam.g:939:2: (otherlv_0= 'repository' ( (lv_nom_1_0= RULE_ID ) ) otherlv_2= 'for' ( (otherlv_3= RULE_ID ) ) otherlv_4= '{' ( (lv_methods_5_0= ruleRepositoryMethod ) )* otherlv_6= '}' )
            // InternalAsam.g:940:3: otherlv_0= 'repository' ( (lv_nom_1_0= RULE_ID ) ) otherlv_2= 'for' ( (otherlv_3= RULE_ID ) ) otherlv_4= '{' ( (lv_methods_5_0= ruleRepositoryMethod ) )* otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,35,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getRepositoryAccess().getRepositoryKeyword_0());
            		
            // InternalAsam.g:944:3: ( (lv_nom_1_0= RULE_ID ) )
            // InternalAsam.g:945:4: (lv_nom_1_0= RULE_ID )
            {
            // InternalAsam.g:945:4: (lv_nom_1_0= RULE_ID )
            // InternalAsam.g:946:5: lv_nom_1_0= RULE_ID
            {
            lv_nom_1_0=(Token)match(input,RULE_ID,FOLLOW_30); 

            					newLeafNode(lv_nom_1_0, grammarAccess.getRepositoryAccess().getNomIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRepositoryRule());
            					}
            					setWithLastConsumed(
            						current,
            						"nom",
            						lv_nom_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,36,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getRepositoryAccess().getForKeyword_2());
            		
            // InternalAsam.g:966:3: ( (otherlv_3= RULE_ID ) )
            // InternalAsam.g:967:4: (otherlv_3= RULE_ID )
            {
            // InternalAsam.g:967:4: (otherlv_3= RULE_ID )
            // InternalAsam.g:968:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRepositoryRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_9); 

            					newLeafNode(otherlv_3, grammarAccess.getRepositoryAccess().getEntityEntityCrossReference_3_0());
            				

            }


            }

            otherlv_4=(Token)match(input,17,FOLLOW_31); 

            			newLeafNode(otherlv_4, grammarAccess.getRepositoryAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalAsam.g:983:3: ( (lv_methods_5_0= ruleRepositoryMethod ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==37||(LA14_0>=40 && LA14_0<=41)) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalAsam.g:984:4: (lv_methods_5_0= ruleRepositoryMethod )
            	    {
            	    // InternalAsam.g:984:4: (lv_methods_5_0= ruleRepositoryMethod )
            	    // InternalAsam.g:985:5: lv_methods_5_0= ruleRepositoryMethod
            	    {

            	    					newCompositeNode(grammarAccess.getRepositoryAccess().getMethodsRepositoryMethodParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_31);
            	    lv_methods_5_0=ruleRepositoryMethod();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getRepositoryRule());
            	    					}
            	    					add(
            	    						current,
            	    						"methods",
            	    						lv_methods_5_0,
            	    						"org.xtext.example.asam.Asam.RepositoryMethod");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            otherlv_6=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getRepositoryAccess().getRightCurlyBracketKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRepository"


    // $ANTLR start "entryRuleRepositoryMethod"
    // InternalAsam.g:1010:1: entryRuleRepositoryMethod returns [EObject current=null] : iv_ruleRepositoryMethod= ruleRepositoryMethod EOF ;
    public final EObject entryRuleRepositoryMethod() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRepositoryMethod = null;


        try {
            // InternalAsam.g:1010:57: (iv_ruleRepositoryMethod= ruleRepositoryMethod EOF )
            // InternalAsam.g:1011:2: iv_ruleRepositoryMethod= ruleRepositoryMethod EOF
            {
             newCompositeNode(grammarAccess.getRepositoryMethodRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRepositoryMethod=ruleRepositoryMethod();

            state._fsp--;

             current =iv_ruleRepositoryMethod; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRepositoryMethod"


    // $ANTLR start "ruleRepositoryMethod"
    // InternalAsam.g:1017:1: ruleRepositoryMethod returns [EObject current=null] : (this_FindByMethod_0= ruleFindByMethod | this_DeleteByMethod_1= ruleDeleteByMethod | this_CustomQueryMethod_2= ruleCustomQueryMethod ) ;
    public final EObject ruleRepositoryMethod() throws RecognitionException {
        EObject current = null;

        EObject this_FindByMethod_0 = null;

        EObject this_DeleteByMethod_1 = null;

        EObject this_CustomQueryMethod_2 = null;



        	enterRule();

        try {
            // InternalAsam.g:1023:2: ( (this_FindByMethod_0= ruleFindByMethod | this_DeleteByMethod_1= ruleDeleteByMethod | this_CustomQueryMethod_2= ruleCustomQueryMethod ) )
            // InternalAsam.g:1024:2: (this_FindByMethod_0= ruleFindByMethod | this_DeleteByMethod_1= ruleDeleteByMethod | this_CustomQueryMethod_2= ruleCustomQueryMethod )
            {
            // InternalAsam.g:1024:2: (this_FindByMethod_0= ruleFindByMethod | this_DeleteByMethod_1= ruleDeleteByMethod | this_CustomQueryMethod_2= ruleCustomQueryMethod )
            int alt15=3;
            switch ( input.LA(1) ) {
            case 37:
                {
                alt15=1;
                }
                break;
            case 40:
                {
                alt15=2;
                }
                break;
            case 41:
                {
                alt15=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // InternalAsam.g:1025:3: this_FindByMethod_0= ruleFindByMethod
                    {

                    			newCompositeNode(grammarAccess.getRepositoryMethodAccess().getFindByMethodParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_FindByMethod_0=ruleFindByMethod();

                    state._fsp--;


                    			current = this_FindByMethod_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalAsam.g:1034:3: this_DeleteByMethod_1= ruleDeleteByMethod
                    {

                    			newCompositeNode(grammarAccess.getRepositoryMethodAccess().getDeleteByMethodParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_DeleteByMethod_1=ruleDeleteByMethod();

                    state._fsp--;


                    			current = this_DeleteByMethod_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalAsam.g:1043:3: this_CustomQueryMethod_2= ruleCustomQueryMethod
                    {

                    			newCompositeNode(grammarAccess.getRepositoryMethodAccess().getCustomQueryMethodParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_CustomQueryMethod_2=ruleCustomQueryMethod();

                    state._fsp--;


                    			current = this_CustomQueryMethod_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRepositoryMethod"


    // $ANTLR start "entryRuleFindByMethod"
    // InternalAsam.g:1055:1: entryRuleFindByMethod returns [EObject current=null] : iv_ruleFindByMethod= ruleFindByMethod EOF ;
    public final EObject entryRuleFindByMethod() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFindByMethod = null;


        try {
            // InternalAsam.g:1055:53: (iv_ruleFindByMethod= ruleFindByMethod EOF )
            // InternalAsam.g:1056:2: iv_ruleFindByMethod= ruleFindByMethod EOF
            {
             newCompositeNode(grammarAccess.getFindByMethodRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFindByMethod=ruleFindByMethod();

            state._fsp--;

             current =iv_ruleFindByMethod; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFindByMethod"


    // $ANTLR start "ruleFindByMethod"
    // InternalAsam.g:1062:1: ruleFindByMethod returns [EObject current=null] : (otherlv_0= 'find' otherlv_1= 'by' ( (lv_property_2_0= RULE_ID ) ) otherlv_3= 'And' ( (lv_prop_4_0= RULE_ID ) ) ) ;
    public final EObject ruleFindByMethod() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_property_2_0=null;
        Token otherlv_3=null;
        Token lv_prop_4_0=null;


        	enterRule();

        try {
            // InternalAsam.g:1068:2: ( (otherlv_0= 'find' otherlv_1= 'by' ( (lv_property_2_0= RULE_ID ) ) otherlv_3= 'And' ( (lv_prop_4_0= RULE_ID ) ) ) )
            // InternalAsam.g:1069:2: (otherlv_0= 'find' otherlv_1= 'by' ( (lv_property_2_0= RULE_ID ) ) otherlv_3= 'And' ( (lv_prop_4_0= RULE_ID ) ) )
            {
            // InternalAsam.g:1069:2: (otherlv_0= 'find' otherlv_1= 'by' ( (lv_property_2_0= RULE_ID ) ) otherlv_3= 'And' ( (lv_prop_4_0= RULE_ID ) ) )
            // InternalAsam.g:1070:3: otherlv_0= 'find' otherlv_1= 'by' ( (lv_property_2_0= RULE_ID ) ) otherlv_3= 'And' ( (lv_prop_4_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,37,FOLLOW_32); 

            			newLeafNode(otherlv_0, grammarAccess.getFindByMethodAccess().getFindKeyword_0());
            		
            otherlv_1=(Token)match(input,38,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getFindByMethodAccess().getByKeyword_1());
            		
            // InternalAsam.g:1078:3: ( (lv_property_2_0= RULE_ID ) )
            // InternalAsam.g:1079:4: (lv_property_2_0= RULE_ID )
            {
            // InternalAsam.g:1079:4: (lv_property_2_0= RULE_ID )
            // InternalAsam.g:1080:5: lv_property_2_0= RULE_ID
            {
            lv_property_2_0=(Token)match(input,RULE_ID,FOLLOW_33); 

            					newLeafNode(lv_property_2_0, grammarAccess.getFindByMethodAccess().getPropertyIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFindByMethodRule());
            					}
            					setWithLastConsumed(
            						current,
            						"property",
            						lv_property_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,39,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getFindByMethodAccess().getAndKeyword_3());
            		
            // InternalAsam.g:1100:3: ( (lv_prop_4_0= RULE_ID ) )
            // InternalAsam.g:1101:4: (lv_prop_4_0= RULE_ID )
            {
            // InternalAsam.g:1101:4: (lv_prop_4_0= RULE_ID )
            // InternalAsam.g:1102:5: lv_prop_4_0= RULE_ID
            {
            lv_prop_4_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_prop_4_0, grammarAccess.getFindByMethodAccess().getPropIDTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFindByMethodRule());
            					}
            					setWithLastConsumed(
            						current,
            						"prop",
            						lv_prop_4_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFindByMethod"


    // $ANTLR start "entryRuleDeleteByMethod"
    // InternalAsam.g:1122:1: entryRuleDeleteByMethod returns [EObject current=null] : iv_ruleDeleteByMethod= ruleDeleteByMethod EOF ;
    public final EObject entryRuleDeleteByMethod() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeleteByMethod = null;


        try {
            // InternalAsam.g:1122:55: (iv_ruleDeleteByMethod= ruleDeleteByMethod EOF )
            // InternalAsam.g:1123:2: iv_ruleDeleteByMethod= ruleDeleteByMethod EOF
            {
             newCompositeNode(grammarAccess.getDeleteByMethodRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDeleteByMethod=ruleDeleteByMethod();

            state._fsp--;

             current =iv_ruleDeleteByMethod; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDeleteByMethod"


    // $ANTLR start "ruleDeleteByMethod"
    // InternalAsam.g:1129:1: ruleDeleteByMethod returns [EObject current=null] : (otherlv_0= 'delete' otherlv_1= 'by' ( (lv_property_2_0= RULE_ID ) ) otherlv_3= 'And' ( (lv_prop_4_0= RULE_ID ) ) ) ;
    public final EObject ruleDeleteByMethod() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_property_2_0=null;
        Token otherlv_3=null;
        Token lv_prop_4_0=null;


        	enterRule();

        try {
            // InternalAsam.g:1135:2: ( (otherlv_0= 'delete' otherlv_1= 'by' ( (lv_property_2_0= RULE_ID ) ) otherlv_3= 'And' ( (lv_prop_4_0= RULE_ID ) ) ) )
            // InternalAsam.g:1136:2: (otherlv_0= 'delete' otherlv_1= 'by' ( (lv_property_2_0= RULE_ID ) ) otherlv_3= 'And' ( (lv_prop_4_0= RULE_ID ) ) )
            {
            // InternalAsam.g:1136:2: (otherlv_0= 'delete' otherlv_1= 'by' ( (lv_property_2_0= RULE_ID ) ) otherlv_3= 'And' ( (lv_prop_4_0= RULE_ID ) ) )
            // InternalAsam.g:1137:3: otherlv_0= 'delete' otherlv_1= 'by' ( (lv_property_2_0= RULE_ID ) ) otherlv_3= 'And' ( (lv_prop_4_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,40,FOLLOW_32); 

            			newLeafNode(otherlv_0, grammarAccess.getDeleteByMethodAccess().getDeleteKeyword_0());
            		
            otherlv_1=(Token)match(input,38,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getDeleteByMethodAccess().getByKeyword_1());
            		
            // InternalAsam.g:1145:3: ( (lv_property_2_0= RULE_ID ) )
            // InternalAsam.g:1146:4: (lv_property_2_0= RULE_ID )
            {
            // InternalAsam.g:1146:4: (lv_property_2_0= RULE_ID )
            // InternalAsam.g:1147:5: lv_property_2_0= RULE_ID
            {
            lv_property_2_0=(Token)match(input,RULE_ID,FOLLOW_33); 

            					newLeafNode(lv_property_2_0, grammarAccess.getDeleteByMethodAccess().getPropertyIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDeleteByMethodRule());
            					}
            					setWithLastConsumed(
            						current,
            						"property",
            						lv_property_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,39,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getDeleteByMethodAccess().getAndKeyword_3());
            		
            // InternalAsam.g:1167:3: ( (lv_prop_4_0= RULE_ID ) )
            // InternalAsam.g:1168:4: (lv_prop_4_0= RULE_ID )
            {
            // InternalAsam.g:1168:4: (lv_prop_4_0= RULE_ID )
            // InternalAsam.g:1169:5: lv_prop_4_0= RULE_ID
            {
            lv_prop_4_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_prop_4_0, grammarAccess.getDeleteByMethodAccess().getPropIDTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDeleteByMethodRule());
            					}
            					setWithLastConsumed(
            						current,
            						"prop",
            						lv_prop_4_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDeleteByMethod"


    // $ANTLR start "entryRuleCustomQueryMethod"
    // InternalAsam.g:1189:1: entryRuleCustomQueryMethod returns [EObject current=null] : iv_ruleCustomQueryMethod= ruleCustomQueryMethod EOF ;
    public final EObject entryRuleCustomQueryMethod() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCustomQueryMethod = null;


        try {
            // InternalAsam.g:1189:58: (iv_ruleCustomQueryMethod= ruleCustomQueryMethod EOF )
            // InternalAsam.g:1190:2: iv_ruleCustomQueryMethod= ruleCustomQueryMethod EOF
            {
             newCompositeNode(grammarAccess.getCustomQueryMethodRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCustomQueryMethod=ruleCustomQueryMethod();

            state._fsp--;

             current =iv_ruleCustomQueryMethod; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCustomQueryMethod"


    // $ANTLR start "ruleCustomQueryMethod"
    // InternalAsam.g:1196:1: ruleCustomQueryMethod returns [EObject current=null] : (otherlv_0= 'customQuery' otherlv_1= '{' ( (lv_query_2_0= RULE_STRING ) ) otherlv_3= '}' ) ;
    public final EObject ruleCustomQueryMethod() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_query_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalAsam.g:1202:2: ( (otherlv_0= 'customQuery' otherlv_1= '{' ( (lv_query_2_0= RULE_STRING ) ) otherlv_3= '}' ) )
            // InternalAsam.g:1203:2: (otherlv_0= 'customQuery' otherlv_1= '{' ( (lv_query_2_0= RULE_STRING ) ) otherlv_3= '}' )
            {
            // InternalAsam.g:1203:2: (otherlv_0= 'customQuery' otherlv_1= '{' ( (lv_query_2_0= RULE_STRING ) ) otherlv_3= '}' )
            // InternalAsam.g:1204:3: otherlv_0= 'customQuery' otherlv_1= '{' ( (lv_query_2_0= RULE_STRING ) ) otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,41,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getCustomQueryMethodAccess().getCustomQueryKeyword_0());
            		
            otherlv_1=(Token)match(input,17,FOLLOW_34); 

            			newLeafNode(otherlv_1, grammarAccess.getCustomQueryMethodAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalAsam.g:1212:3: ( (lv_query_2_0= RULE_STRING ) )
            // InternalAsam.g:1213:4: (lv_query_2_0= RULE_STRING )
            {
            // InternalAsam.g:1213:4: (lv_query_2_0= RULE_STRING )
            // InternalAsam.g:1214:5: lv_query_2_0= RULE_STRING
            {
            lv_query_2_0=(Token)match(input,RULE_STRING,FOLLOW_12); 

            					newLeafNode(lv_query_2_0, grammarAccess.getCustomQueryMethodAccess().getQuerySTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCustomQueryMethodRule());
            					}
            					setWithLastConsumed(
            						current,
            						"query",
            						lv_query_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_3=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getCustomQueryMethodAccess().getRightCurlyBracketKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCustomQueryMethod"


    // $ANTLR start "entryRuleServiceAction"
    // InternalAsam.g:1238:1: entryRuleServiceAction returns [EObject current=null] : iv_ruleServiceAction= ruleServiceAction EOF ;
    public final EObject entryRuleServiceAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleServiceAction = null;


        try {
            // InternalAsam.g:1238:54: (iv_ruleServiceAction= ruleServiceAction EOF )
            // InternalAsam.g:1239:2: iv_ruleServiceAction= ruleServiceAction EOF
            {
             newCompositeNode(grammarAccess.getServiceActionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleServiceAction=ruleServiceAction();

            state._fsp--;

             current =iv_ruleServiceAction; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleServiceAction"


    // $ANTLR start "ruleServiceAction"
    // InternalAsam.g:1245:1: ruleServiceAction returns [EObject current=null] : (otherlv_0= 'operation' ( (lv_nom_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'returns' ( (lv_returnType_4_0= ruleRType ) ) (otherlv_5= 'raises' ( (lv_exceptionType_6_0= ruleType ) ) )? (otherlv_7= 'implementation' ( (lv_implementation_8_0= RULE_STRING ) ) )? otherlv_9= 'params' otherlv_10= '(' ( (lv_parameters_11_0= ruleActionParameter ) )* otherlv_12= ')' otherlv_13= '}' ) ;
    public final EObject ruleServiceAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_nom_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token lv_implementation_8_0=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        EObject lv_returnType_4_0 = null;

        EObject lv_exceptionType_6_0 = null;

        EObject lv_parameters_11_0 = null;



        	enterRule();

        try {
            // InternalAsam.g:1251:2: ( (otherlv_0= 'operation' ( (lv_nom_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'returns' ( (lv_returnType_4_0= ruleRType ) ) (otherlv_5= 'raises' ( (lv_exceptionType_6_0= ruleType ) ) )? (otherlv_7= 'implementation' ( (lv_implementation_8_0= RULE_STRING ) ) )? otherlv_9= 'params' otherlv_10= '(' ( (lv_parameters_11_0= ruleActionParameter ) )* otherlv_12= ')' otherlv_13= '}' ) )
            // InternalAsam.g:1252:2: (otherlv_0= 'operation' ( (lv_nom_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'returns' ( (lv_returnType_4_0= ruleRType ) ) (otherlv_5= 'raises' ( (lv_exceptionType_6_0= ruleType ) ) )? (otherlv_7= 'implementation' ( (lv_implementation_8_0= RULE_STRING ) ) )? otherlv_9= 'params' otherlv_10= '(' ( (lv_parameters_11_0= ruleActionParameter ) )* otherlv_12= ')' otherlv_13= '}' )
            {
            // InternalAsam.g:1252:2: (otherlv_0= 'operation' ( (lv_nom_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'returns' ( (lv_returnType_4_0= ruleRType ) ) (otherlv_5= 'raises' ( (lv_exceptionType_6_0= ruleType ) ) )? (otherlv_7= 'implementation' ( (lv_implementation_8_0= RULE_STRING ) ) )? otherlv_9= 'params' otherlv_10= '(' ( (lv_parameters_11_0= ruleActionParameter ) )* otherlv_12= ')' otherlv_13= '}' )
            // InternalAsam.g:1253:3: otherlv_0= 'operation' ( (lv_nom_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'returns' ( (lv_returnType_4_0= ruleRType ) ) (otherlv_5= 'raises' ( (lv_exceptionType_6_0= ruleType ) ) )? (otherlv_7= 'implementation' ( (lv_implementation_8_0= RULE_STRING ) ) )? otherlv_9= 'params' otherlv_10= '(' ( (lv_parameters_11_0= ruleActionParameter ) )* otherlv_12= ')' otherlv_13= '}'
            {
            otherlv_0=(Token)match(input,42,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getServiceActionAccess().getOperationKeyword_0());
            		
            // InternalAsam.g:1257:3: ( (lv_nom_1_0= RULE_ID ) )
            // InternalAsam.g:1258:4: (lv_nom_1_0= RULE_ID )
            {
            // InternalAsam.g:1258:4: (lv_nom_1_0= RULE_ID )
            // InternalAsam.g:1259:5: lv_nom_1_0= RULE_ID
            {
            lv_nom_1_0=(Token)match(input,RULE_ID,FOLLOW_9); 

            					newLeafNode(lv_nom_1_0, grammarAccess.getServiceActionAccess().getNomIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getServiceActionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"nom",
            						lv_nom_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,17,FOLLOW_35); 

            			newLeafNode(otherlv_2, grammarAccess.getServiceActionAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,43,FOLLOW_36); 

            			newLeafNode(otherlv_3, grammarAccess.getServiceActionAccess().getReturnsKeyword_3());
            		
            // InternalAsam.g:1283:3: ( (lv_returnType_4_0= ruleRType ) )
            // InternalAsam.g:1284:4: (lv_returnType_4_0= ruleRType )
            {
            // InternalAsam.g:1284:4: (lv_returnType_4_0= ruleRType )
            // InternalAsam.g:1285:5: lv_returnType_4_0= ruleRType
            {

            					newCompositeNode(grammarAccess.getServiceActionAccess().getReturnTypeRTypeParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_37);
            lv_returnType_4_0=ruleRType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getServiceActionRule());
            					}
            					set(
            						current,
            						"returnType",
            						lv_returnType_4_0,
            						"org.xtext.example.asam.Asam.RType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalAsam.g:1302:3: (otherlv_5= 'raises' ( (lv_exceptionType_6_0= ruleType ) ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==44) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalAsam.g:1303:4: otherlv_5= 'raises' ( (lv_exceptionType_6_0= ruleType ) )
                    {
                    otherlv_5=(Token)match(input,44,FOLLOW_38); 

                    				newLeafNode(otherlv_5, grammarAccess.getServiceActionAccess().getRaisesKeyword_5_0());
                    			
                    // InternalAsam.g:1307:4: ( (lv_exceptionType_6_0= ruleType ) )
                    // InternalAsam.g:1308:5: (lv_exceptionType_6_0= ruleType )
                    {
                    // InternalAsam.g:1308:5: (lv_exceptionType_6_0= ruleType )
                    // InternalAsam.g:1309:6: lv_exceptionType_6_0= ruleType
                    {

                    						newCompositeNode(grammarAccess.getServiceActionAccess().getExceptionTypeTypeParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_39);
                    lv_exceptionType_6_0=ruleType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getServiceActionRule());
                    						}
                    						set(
                    							current,
                    							"exceptionType",
                    							lv_exceptionType_6_0,
                    							"org.xtext.example.asam.Asam.Type");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalAsam.g:1327:3: (otherlv_7= 'implementation' ( (lv_implementation_8_0= RULE_STRING ) ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==45) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalAsam.g:1328:4: otherlv_7= 'implementation' ( (lv_implementation_8_0= RULE_STRING ) )
                    {
                    otherlv_7=(Token)match(input,45,FOLLOW_34); 

                    				newLeafNode(otherlv_7, grammarAccess.getServiceActionAccess().getImplementationKeyword_6_0());
                    			
                    // InternalAsam.g:1332:4: ( (lv_implementation_8_0= RULE_STRING ) )
                    // InternalAsam.g:1333:5: (lv_implementation_8_0= RULE_STRING )
                    {
                    // InternalAsam.g:1333:5: (lv_implementation_8_0= RULE_STRING )
                    // InternalAsam.g:1334:6: lv_implementation_8_0= RULE_STRING
                    {
                    lv_implementation_8_0=(Token)match(input,RULE_STRING,FOLLOW_40); 

                    						newLeafNode(lv_implementation_8_0, grammarAccess.getServiceActionAccess().getImplementationSTRINGTerminalRuleCall_6_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getServiceActionRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"implementation",
                    							lv_implementation_8_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_9=(Token)match(input,46,FOLLOW_41); 

            			newLeafNode(otherlv_9, grammarAccess.getServiceActionAccess().getParamsKeyword_7());
            		
            otherlv_10=(Token)match(input,47,FOLLOW_42); 

            			newLeafNode(otherlv_10, grammarAccess.getServiceActionAccess().getLeftParenthesisKeyword_8());
            		
            // InternalAsam.g:1359:3: ( (lv_parameters_11_0= ruleActionParameter ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==RULE_ID) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalAsam.g:1360:4: (lv_parameters_11_0= ruleActionParameter )
            	    {
            	    // InternalAsam.g:1360:4: (lv_parameters_11_0= ruleActionParameter )
            	    // InternalAsam.g:1361:5: lv_parameters_11_0= ruleActionParameter
            	    {

            	    					newCompositeNode(grammarAccess.getServiceActionAccess().getParametersActionParameterParserRuleCall_9_0());
            	    				
            	    pushFollow(FOLLOW_42);
            	    lv_parameters_11_0=ruleActionParameter();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getServiceActionRule());
            	    					}
            	    					add(
            	    						current,
            	    						"parameters",
            	    						lv_parameters_11_0,
            	    						"org.xtext.example.asam.Asam.ActionParameter");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

            otherlv_12=(Token)match(input,48,FOLLOW_12); 

            			newLeafNode(otherlv_12, grammarAccess.getServiceActionAccess().getRightParenthesisKeyword_10());
            		
            otherlv_13=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_13, grammarAccess.getServiceActionAccess().getRightCurlyBracketKeyword_11());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleServiceAction"


    // $ANTLR start "entryRuleControllerAction"
    // InternalAsam.g:1390:1: entryRuleControllerAction returns [EObject current=null] : iv_ruleControllerAction= ruleControllerAction EOF ;
    public final EObject entryRuleControllerAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleControllerAction = null;


        try {
            // InternalAsam.g:1390:57: (iv_ruleControllerAction= ruleControllerAction EOF )
            // InternalAsam.g:1391:2: iv_ruleControllerAction= ruleControllerAction EOF
            {
             newCompositeNode(grammarAccess.getControllerActionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleControllerAction=ruleControllerAction();

            state._fsp--;

             current =iv_ruleControllerAction; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleControllerAction"


    // $ANTLR start "ruleControllerAction"
    // InternalAsam.g:1397:1: ruleControllerAction returns [EObject current=null] : ( ( (lv_method_0_0= ruleHttpMethods ) ) otherlv_1= 'action' ( (lv_nom_2_0= RULE_ID ) ) otherlv_3= '{' otherlv_4= 'linkedTo' ( (lv_serviceAction_5_0= RULE_ID ) ) (otherlv_6= 'mappedAt' ( (lv_url_7_0= RULE_STRING ) ) )? ( (lv_parameters_8_0= ruleActionParameter ) )* otherlv_9= '}' ) ;
    public final EObject ruleControllerAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_nom_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_serviceAction_5_0=null;
        Token otherlv_6=null;
        Token lv_url_7_0=null;
        Token otherlv_9=null;
        Enumerator lv_method_0_0 = null;

        EObject lv_parameters_8_0 = null;



        	enterRule();

        try {
            // InternalAsam.g:1403:2: ( ( ( (lv_method_0_0= ruleHttpMethods ) ) otherlv_1= 'action' ( (lv_nom_2_0= RULE_ID ) ) otherlv_3= '{' otherlv_4= 'linkedTo' ( (lv_serviceAction_5_0= RULE_ID ) ) (otherlv_6= 'mappedAt' ( (lv_url_7_0= RULE_STRING ) ) )? ( (lv_parameters_8_0= ruleActionParameter ) )* otherlv_9= '}' ) )
            // InternalAsam.g:1404:2: ( ( (lv_method_0_0= ruleHttpMethods ) ) otherlv_1= 'action' ( (lv_nom_2_0= RULE_ID ) ) otherlv_3= '{' otherlv_4= 'linkedTo' ( (lv_serviceAction_5_0= RULE_ID ) ) (otherlv_6= 'mappedAt' ( (lv_url_7_0= RULE_STRING ) ) )? ( (lv_parameters_8_0= ruleActionParameter ) )* otherlv_9= '}' )
            {
            // InternalAsam.g:1404:2: ( ( (lv_method_0_0= ruleHttpMethods ) ) otherlv_1= 'action' ( (lv_nom_2_0= RULE_ID ) ) otherlv_3= '{' otherlv_4= 'linkedTo' ( (lv_serviceAction_5_0= RULE_ID ) ) (otherlv_6= 'mappedAt' ( (lv_url_7_0= RULE_STRING ) ) )? ( (lv_parameters_8_0= ruleActionParameter ) )* otherlv_9= '}' )
            // InternalAsam.g:1405:3: ( (lv_method_0_0= ruleHttpMethods ) ) otherlv_1= 'action' ( (lv_nom_2_0= RULE_ID ) ) otherlv_3= '{' otherlv_4= 'linkedTo' ( (lv_serviceAction_5_0= RULE_ID ) ) (otherlv_6= 'mappedAt' ( (lv_url_7_0= RULE_STRING ) ) )? ( (lv_parameters_8_0= ruleActionParameter ) )* otherlv_9= '}'
            {
            // InternalAsam.g:1405:3: ( (lv_method_0_0= ruleHttpMethods ) )
            // InternalAsam.g:1406:4: (lv_method_0_0= ruleHttpMethods )
            {
            // InternalAsam.g:1406:4: (lv_method_0_0= ruleHttpMethods )
            // InternalAsam.g:1407:5: lv_method_0_0= ruleHttpMethods
            {

            					newCompositeNode(grammarAccess.getControllerActionAccess().getMethodHttpMethodsEnumRuleCall_0_0());
            				
            pushFollow(FOLLOW_43);
            lv_method_0_0=ruleHttpMethods();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getControllerActionRule());
            					}
            					set(
            						current,
            						"method",
            						lv_method_0_0,
            						"org.xtext.example.asam.Asam.HttpMethods");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,49,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getControllerActionAccess().getActionKeyword_1());
            		
            // InternalAsam.g:1428:3: ( (lv_nom_2_0= RULE_ID ) )
            // InternalAsam.g:1429:4: (lv_nom_2_0= RULE_ID )
            {
            // InternalAsam.g:1429:4: (lv_nom_2_0= RULE_ID )
            // InternalAsam.g:1430:5: lv_nom_2_0= RULE_ID
            {
            lv_nom_2_0=(Token)match(input,RULE_ID,FOLLOW_9); 

            					newLeafNode(lv_nom_2_0, grammarAccess.getControllerActionAccess().getNomIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getControllerActionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"nom",
            						lv_nom_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,17,FOLLOW_44); 

            			newLeafNode(otherlv_3, grammarAccess.getControllerActionAccess().getLeftCurlyBracketKeyword_3());
            		
            otherlv_4=(Token)match(input,50,FOLLOW_3); 

            			newLeafNode(otherlv_4, grammarAccess.getControllerActionAccess().getLinkedToKeyword_4());
            		
            // InternalAsam.g:1454:3: ( (lv_serviceAction_5_0= RULE_ID ) )
            // InternalAsam.g:1455:4: (lv_serviceAction_5_0= RULE_ID )
            {
            // InternalAsam.g:1455:4: (lv_serviceAction_5_0= RULE_ID )
            // InternalAsam.g:1456:5: lv_serviceAction_5_0= RULE_ID
            {
            lv_serviceAction_5_0=(Token)match(input,RULE_ID,FOLLOW_45); 

            					newLeafNode(lv_serviceAction_5_0, grammarAccess.getControllerActionAccess().getServiceActionIDTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getControllerActionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"serviceAction",
            						lv_serviceAction_5_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalAsam.g:1472:3: (otherlv_6= 'mappedAt' ( (lv_url_7_0= RULE_STRING ) ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==51) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalAsam.g:1473:4: otherlv_6= 'mappedAt' ( (lv_url_7_0= RULE_STRING ) )
                    {
                    otherlv_6=(Token)match(input,51,FOLLOW_34); 

                    				newLeafNode(otherlv_6, grammarAccess.getControllerActionAccess().getMappedAtKeyword_6_0());
                    			
                    // InternalAsam.g:1477:4: ( (lv_url_7_0= RULE_STRING ) )
                    // InternalAsam.g:1478:5: (lv_url_7_0= RULE_STRING )
                    {
                    // InternalAsam.g:1478:5: (lv_url_7_0= RULE_STRING )
                    // InternalAsam.g:1479:6: lv_url_7_0= RULE_STRING
                    {
                    lv_url_7_0=(Token)match(input,RULE_STRING,FOLLOW_24); 

                    						newLeafNode(lv_url_7_0, grammarAccess.getControllerActionAccess().getUrlSTRINGTerminalRuleCall_6_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getControllerActionRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"url",
                    							lv_url_7_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalAsam.g:1496:3: ( (lv_parameters_8_0= ruleActionParameter ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==RULE_ID) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalAsam.g:1497:4: (lv_parameters_8_0= ruleActionParameter )
            	    {
            	    // InternalAsam.g:1497:4: (lv_parameters_8_0= ruleActionParameter )
            	    // InternalAsam.g:1498:5: lv_parameters_8_0= ruleActionParameter
            	    {

            	    					newCompositeNode(grammarAccess.getControllerActionAccess().getParametersActionParameterParserRuleCall_7_0());
            	    				
            	    pushFollow(FOLLOW_24);
            	    lv_parameters_8_0=ruleActionParameter();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getControllerActionRule());
            	    					}
            	    					add(
            	    						current,
            	    						"parameters",
            	    						lv_parameters_8_0,
            	    						"org.xtext.example.asam.Asam.ActionParameter");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

            otherlv_9=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getControllerActionAccess().getRightCurlyBracketKeyword_8());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleControllerAction"


    // $ANTLR start "entryRuleActionParameter"
    // InternalAsam.g:1523:1: entryRuleActionParameter returns [EObject current=null] : iv_ruleActionParameter= ruleActionParameter EOF ;
    public final EObject entryRuleActionParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActionParameter = null;


        try {
            // InternalAsam.g:1523:56: (iv_ruleActionParameter= ruleActionParameter EOF )
            // InternalAsam.g:1524:2: iv_ruleActionParameter= ruleActionParameter EOF
            {
             newCompositeNode(grammarAccess.getActionParameterRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleActionParameter=ruleActionParameter();

            state._fsp--;

             current =iv_ruleActionParameter; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleActionParameter"


    // $ANTLR start "ruleActionParameter"
    // InternalAsam.g:1530:1: ruleActionParameter returns [EObject current=null] : ( ( (lv_nom_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleType ) ) (otherlv_3= 'default' ( (lv_defaultValue_4_0= RULE_STRING ) ) )? ) ;
    public final EObject ruleActionParameter() throws RecognitionException {
        EObject current = null;

        Token lv_nom_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token lv_defaultValue_4_0=null;
        EObject lv_type_2_0 = null;



        	enterRule();

        try {
            // InternalAsam.g:1536:2: ( ( ( (lv_nom_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleType ) ) (otherlv_3= 'default' ( (lv_defaultValue_4_0= RULE_STRING ) ) )? ) )
            // InternalAsam.g:1537:2: ( ( (lv_nom_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleType ) ) (otherlv_3= 'default' ( (lv_defaultValue_4_0= RULE_STRING ) ) )? )
            {
            // InternalAsam.g:1537:2: ( ( (lv_nom_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleType ) ) (otherlv_3= 'default' ( (lv_defaultValue_4_0= RULE_STRING ) ) )? )
            // InternalAsam.g:1538:3: ( (lv_nom_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleType ) ) (otherlv_3= 'default' ( (lv_defaultValue_4_0= RULE_STRING ) ) )?
            {
            // InternalAsam.g:1538:3: ( (lv_nom_0_0= RULE_ID ) )
            // InternalAsam.g:1539:4: (lv_nom_0_0= RULE_ID )
            {
            // InternalAsam.g:1539:4: (lv_nom_0_0= RULE_ID )
            // InternalAsam.g:1540:5: lv_nom_0_0= RULE_ID
            {
            lv_nom_0_0=(Token)match(input,RULE_ID,FOLLOW_46); 

            					newLeafNode(lv_nom_0_0, grammarAccess.getActionParameterAccess().getNomIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getActionParameterRule());
            					}
            					setWithLastConsumed(
            						current,
            						"nom",
            						lv_nom_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,52,FOLLOW_38); 

            			newLeafNode(otherlv_1, grammarAccess.getActionParameterAccess().getColonKeyword_1());
            		
            // InternalAsam.g:1560:3: ( (lv_type_2_0= ruleType ) )
            // InternalAsam.g:1561:4: (lv_type_2_0= ruleType )
            {
            // InternalAsam.g:1561:4: (lv_type_2_0= ruleType )
            // InternalAsam.g:1562:5: lv_type_2_0= ruleType
            {

            					newCompositeNode(grammarAccess.getActionParameterAccess().getTypeTypeParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_47);
            lv_type_2_0=ruleType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getActionParameterRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_2_0,
            						"org.xtext.example.asam.Asam.Type");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalAsam.g:1579:3: (otherlv_3= 'default' ( (lv_defaultValue_4_0= RULE_STRING ) ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==53) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalAsam.g:1580:4: otherlv_3= 'default' ( (lv_defaultValue_4_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,53,FOLLOW_34); 

                    				newLeafNode(otherlv_3, grammarAccess.getActionParameterAccess().getDefaultKeyword_3_0());
                    			
                    // InternalAsam.g:1584:4: ( (lv_defaultValue_4_0= RULE_STRING ) )
                    // InternalAsam.g:1585:5: (lv_defaultValue_4_0= RULE_STRING )
                    {
                    // InternalAsam.g:1585:5: (lv_defaultValue_4_0= RULE_STRING )
                    // InternalAsam.g:1586:6: lv_defaultValue_4_0= RULE_STRING
                    {
                    lv_defaultValue_4_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    						newLeafNode(lv_defaultValue_4_0, grammarAccess.getActionParameterAccess().getDefaultValueSTRINGTerminalRuleCall_3_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getActionParameterRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"defaultValue",
                    							lv_defaultValue_4_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleActionParameter"


    // $ANTLR start "entryRuleProperty"
    // InternalAsam.g:1607:1: entryRuleProperty returns [EObject current=null] : iv_ruleProperty= ruleProperty EOF ;
    public final EObject entryRuleProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProperty = null;


        try {
            // InternalAsam.g:1607:49: (iv_ruleProperty= ruleProperty EOF )
            // InternalAsam.g:1608:2: iv_ruleProperty= ruleProperty EOF
            {
             newCompositeNode(grammarAccess.getPropertyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProperty=ruleProperty();

            state._fsp--;

             current =iv_ruleProperty; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleProperty"


    // $ANTLR start "ruleProperty"
    // InternalAsam.g:1614:1: ruleProperty returns [EObject current=null] : ( ( (lv_nom_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleType ) ) (otherlv_3= 'default' ( (lv_defaultValue_4_0= RULE_STRING ) ) )? ) ;
    public final EObject ruleProperty() throws RecognitionException {
        EObject current = null;

        Token lv_nom_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token lv_defaultValue_4_0=null;
        EObject lv_type_2_0 = null;



        	enterRule();

        try {
            // InternalAsam.g:1620:2: ( ( ( (lv_nom_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleType ) ) (otherlv_3= 'default' ( (lv_defaultValue_4_0= RULE_STRING ) ) )? ) )
            // InternalAsam.g:1621:2: ( ( (lv_nom_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleType ) ) (otherlv_3= 'default' ( (lv_defaultValue_4_0= RULE_STRING ) ) )? )
            {
            // InternalAsam.g:1621:2: ( ( (lv_nom_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleType ) ) (otherlv_3= 'default' ( (lv_defaultValue_4_0= RULE_STRING ) ) )? )
            // InternalAsam.g:1622:3: ( (lv_nom_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleType ) ) (otherlv_3= 'default' ( (lv_defaultValue_4_0= RULE_STRING ) ) )?
            {
            // InternalAsam.g:1622:3: ( (lv_nom_0_0= RULE_ID ) )
            // InternalAsam.g:1623:4: (lv_nom_0_0= RULE_ID )
            {
            // InternalAsam.g:1623:4: (lv_nom_0_0= RULE_ID )
            // InternalAsam.g:1624:5: lv_nom_0_0= RULE_ID
            {
            lv_nom_0_0=(Token)match(input,RULE_ID,FOLLOW_46); 

            					newLeafNode(lv_nom_0_0, grammarAccess.getPropertyAccess().getNomIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPropertyRule());
            					}
            					setWithLastConsumed(
            						current,
            						"nom",
            						lv_nom_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,52,FOLLOW_38); 

            			newLeafNode(otherlv_1, grammarAccess.getPropertyAccess().getColonKeyword_1());
            		
            // InternalAsam.g:1644:3: ( (lv_type_2_0= ruleType ) )
            // InternalAsam.g:1645:4: (lv_type_2_0= ruleType )
            {
            // InternalAsam.g:1645:4: (lv_type_2_0= ruleType )
            // InternalAsam.g:1646:5: lv_type_2_0= ruleType
            {

            					newCompositeNode(grammarAccess.getPropertyAccess().getTypeTypeParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_47);
            lv_type_2_0=ruleType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPropertyRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_2_0,
            						"org.xtext.example.asam.Asam.Type");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalAsam.g:1663:3: (otherlv_3= 'default' ( (lv_defaultValue_4_0= RULE_STRING ) ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==53) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalAsam.g:1664:4: otherlv_3= 'default' ( (lv_defaultValue_4_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,53,FOLLOW_34); 

                    				newLeafNode(otherlv_3, grammarAccess.getPropertyAccess().getDefaultKeyword_3_0());
                    			
                    // InternalAsam.g:1668:4: ( (lv_defaultValue_4_0= RULE_STRING ) )
                    // InternalAsam.g:1669:5: (lv_defaultValue_4_0= RULE_STRING )
                    {
                    // InternalAsam.g:1669:5: (lv_defaultValue_4_0= RULE_STRING )
                    // InternalAsam.g:1670:6: lv_defaultValue_4_0= RULE_STRING
                    {
                    lv_defaultValue_4_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    						newLeafNode(lv_defaultValue_4_0, grammarAccess.getPropertyAccess().getDefaultValueSTRINGTerminalRuleCall_3_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getPropertyRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"defaultValue",
                    							lv_defaultValue_4_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleProperty"


    // $ANTLR start "entryRuleType"
    // InternalAsam.g:1691:1: entryRuleType returns [EObject current=null] : iv_ruleType= ruleType EOF ;
    public final EObject entryRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType = null;


        try {
            // InternalAsam.g:1691:45: (iv_ruleType= ruleType EOF )
            // InternalAsam.g:1692:2: iv_ruleType= ruleType EOF
            {
             newCompositeNode(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleType=ruleType();

            state._fsp--;

             current =iv_ruleType; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // InternalAsam.g:1698:1: ruleType returns [EObject current=null] : ( ( (lv_Vtypes_0_0= ruleVTypes ) ) | this_ListType_1= ruleListType | this_SetType_2= ruleSetType ) ;
    public final EObject ruleType() throws RecognitionException {
        EObject current = null;

        Enumerator lv_Vtypes_0_0 = null;

        EObject this_ListType_1 = null;

        EObject this_SetType_2 = null;



        	enterRule();

        try {
            // InternalAsam.g:1704:2: ( ( ( (lv_Vtypes_0_0= ruleVTypes ) ) | this_ListType_1= ruleListType | this_SetType_2= ruleSetType ) )
            // InternalAsam.g:1705:2: ( ( (lv_Vtypes_0_0= ruleVTypes ) ) | this_ListType_1= ruleListType | this_SetType_2= ruleSetType )
            {
            // InternalAsam.g:1705:2: ( ( (lv_Vtypes_0_0= ruleVTypes ) ) | this_ListType_1= ruleListType | this_SetType_2= ruleSetType )
            int alt23=3;
            switch ( input.LA(1) ) {
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
                {
                alt23=1;
                }
                break;
            case 54:
                {
                alt23=2;
                }
                break;
            case 56:
                {
                alt23=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }

            switch (alt23) {
                case 1 :
                    // InternalAsam.g:1706:3: ( (lv_Vtypes_0_0= ruleVTypes ) )
                    {
                    // InternalAsam.g:1706:3: ( (lv_Vtypes_0_0= ruleVTypes ) )
                    // InternalAsam.g:1707:4: (lv_Vtypes_0_0= ruleVTypes )
                    {
                    // InternalAsam.g:1707:4: (lv_Vtypes_0_0= ruleVTypes )
                    // InternalAsam.g:1708:5: lv_Vtypes_0_0= ruleVTypes
                    {

                    					newCompositeNode(grammarAccess.getTypeAccess().getVtypesVTypesEnumRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_Vtypes_0_0=ruleVTypes();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getTypeRule());
                    					}
                    					set(
                    						current,
                    						"Vtypes",
                    						lv_Vtypes_0_0,
                    						"org.xtext.example.asam.Asam.VTypes");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalAsam.g:1726:3: this_ListType_1= ruleListType
                    {

                    			newCompositeNode(grammarAccess.getTypeAccess().getListTypeParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ListType_1=ruleListType();

                    state._fsp--;


                    			current = this_ListType_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalAsam.g:1735:3: this_SetType_2= ruleSetType
                    {

                    			newCompositeNode(grammarAccess.getTypeAccess().getSetTypeParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_SetType_2=ruleSetType();

                    state._fsp--;


                    			current = this_SetType_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleRType"
    // InternalAsam.g:1747:1: entryRuleRType returns [EObject current=null] : iv_ruleRType= ruleRType EOF ;
    public final EObject entryRuleRType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRType = null;


        try {
            // InternalAsam.g:1747:46: (iv_ruleRType= ruleRType EOF )
            // InternalAsam.g:1748:2: iv_ruleRType= ruleRType EOF
            {
             newCompositeNode(grammarAccess.getRTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRType=ruleRType();

            state._fsp--;

             current =iv_ruleRType; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRType"


    // $ANTLR start "ruleRType"
    // InternalAsam.g:1754:1: ruleRType returns [EObject current=null] : ( ( (lv_Vypes_0_0= ruleVTypes ) ) | this_ListType_1= ruleListType | this_ID_2= RULE_ID ) ;
    public final EObject ruleRType() throws RecognitionException {
        EObject current = null;

        Token this_ID_2=null;
        Enumerator lv_Vypes_0_0 = null;

        EObject this_ListType_1 = null;



        	enterRule();

        try {
            // InternalAsam.g:1760:2: ( ( ( (lv_Vypes_0_0= ruleVTypes ) ) | this_ListType_1= ruleListType | this_ID_2= RULE_ID ) )
            // InternalAsam.g:1761:2: ( ( (lv_Vypes_0_0= ruleVTypes ) ) | this_ListType_1= ruleListType | this_ID_2= RULE_ID )
            {
            // InternalAsam.g:1761:2: ( ( (lv_Vypes_0_0= ruleVTypes ) ) | this_ListType_1= ruleListType | this_ID_2= RULE_ID )
            int alt24=3;
            switch ( input.LA(1) ) {
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
                {
                alt24=1;
                }
                break;
            case 54:
                {
                alt24=2;
                }
                break;
            case RULE_ID:
                {
                alt24=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }

            switch (alt24) {
                case 1 :
                    // InternalAsam.g:1762:3: ( (lv_Vypes_0_0= ruleVTypes ) )
                    {
                    // InternalAsam.g:1762:3: ( (lv_Vypes_0_0= ruleVTypes ) )
                    // InternalAsam.g:1763:4: (lv_Vypes_0_0= ruleVTypes )
                    {
                    // InternalAsam.g:1763:4: (lv_Vypes_0_0= ruleVTypes )
                    // InternalAsam.g:1764:5: lv_Vypes_0_0= ruleVTypes
                    {

                    					newCompositeNode(grammarAccess.getRTypeAccess().getVypesVTypesEnumRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_Vypes_0_0=ruleVTypes();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getRTypeRule());
                    					}
                    					set(
                    						current,
                    						"Vypes",
                    						lv_Vypes_0_0,
                    						"org.xtext.example.asam.Asam.VTypes");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalAsam.g:1782:3: this_ListType_1= ruleListType
                    {

                    			newCompositeNode(grammarAccess.getRTypeAccess().getListTypeParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ListType_1=ruleListType();

                    state._fsp--;


                    			current = this_ListType_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalAsam.g:1791:3: this_ID_2= RULE_ID
                    {
                    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			newLeafNode(this_ID_2, grammarAccess.getRTypeAccess().getIDTerminalRuleCall_2());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRType"


    // $ANTLR start "entryRuleListType"
    // InternalAsam.g:1799:1: entryRuleListType returns [EObject current=null] : iv_ruleListType= ruleListType EOF ;
    public final EObject entryRuleListType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleListType = null;


        try {
            // InternalAsam.g:1799:49: (iv_ruleListType= ruleListType EOF )
            // InternalAsam.g:1800:2: iv_ruleListType= ruleListType EOF
            {
             newCompositeNode(grammarAccess.getListTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleListType=ruleListType();

            state._fsp--;

             current =iv_ruleListType; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleListType"


    // $ANTLR start "ruleListType"
    // InternalAsam.g:1806:1: ruleListType returns [EObject current=null] : (otherlv_0= 'List<' ( (lv_type_1_0= ruleType ) ) otherlv_2= '>' ) ;
    public final EObject ruleListType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_type_1_0 = null;



        	enterRule();

        try {
            // InternalAsam.g:1812:2: ( (otherlv_0= 'List<' ( (lv_type_1_0= ruleType ) ) otherlv_2= '>' ) )
            // InternalAsam.g:1813:2: (otherlv_0= 'List<' ( (lv_type_1_0= ruleType ) ) otherlv_2= '>' )
            {
            // InternalAsam.g:1813:2: (otherlv_0= 'List<' ( (lv_type_1_0= ruleType ) ) otherlv_2= '>' )
            // InternalAsam.g:1814:3: otherlv_0= 'List<' ( (lv_type_1_0= ruleType ) ) otherlv_2= '>'
            {
            otherlv_0=(Token)match(input,54,FOLLOW_38); 

            			newLeafNode(otherlv_0, grammarAccess.getListTypeAccess().getListKeyword_0());
            		
            // InternalAsam.g:1818:3: ( (lv_type_1_0= ruleType ) )
            // InternalAsam.g:1819:4: (lv_type_1_0= ruleType )
            {
            // InternalAsam.g:1819:4: (lv_type_1_0= ruleType )
            // InternalAsam.g:1820:5: lv_type_1_0= ruleType
            {

            					newCompositeNode(grammarAccess.getListTypeAccess().getTypeTypeParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_48);
            lv_type_1_0=ruleType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getListTypeRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_1_0,
            						"org.xtext.example.asam.Asam.Type");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,55,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getListTypeAccess().getGreaterThanSignKeyword_2());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleListType"


    // $ANTLR start "entryRuleSetType"
    // InternalAsam.g:1845:1: entryRuleSetType returns [EObject current=null] : iv_ruleSetType= ruleSetType EOF ;
    public final EObject entryRuleSetType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSetType = null;


        try {
            // InternalAsam.g:1845:48: (iv_ruleSetType= ruleSetType EOF )
            // InternalAsam.g:1846:2: iv_ruleSetType= ruleSetType EOF
            {
             newCompositeNode(grammarAccess.getSetTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSetType=ruleSetType();

            state._fsp--;

             current =iv_ruleSetType; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSetType"


    // $ANTLR start "ruleSetType"
    // InternalAsam.g:1852:1: ruleSetType returns [EObject current=null] : (otherlv_0= 'Set<' ( (lv_type_1_0= ruleType ) ) otherlv_2= '>' ) ;
    public final EObject ruleSetType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_type_1_0 = null;



        	enterRule();

        try {
            // InternalAsam.g:1858:2: ( (otherlv_0= 'Set<' ( (lv_type_1_0= ruleType ) ) otherlv_2= '>' ) )
            // InternalAsam.g:1859:2: (otherlv_0= 'Set<' ( (lv_type_1_0= ruleType ) ) otherlv_2= '>' )
            {
            // InternalAsam.g:1859:2: (otherlv_0= 'Set<' ( (lv_type_1_0= ruleType ) ) otherlv_2= '>' )
            // InternalAsam.g:1860:3: otherlv_0= 'Set<' ( (lv_type_1_0= ruleType ) ) otherlv_2= '>'
            {
            otherlv_0=(Token)match(input,56,FOLLOW_38); 

            			newLeafNode(otherlv_0, grammarAccess.getSetTypeAccess().getSetKeyword_0());
            		
            // InternalAsam.g:1864:3: ( (lv_type_1_0= ruleType ) )
            // InternalAsam.g:1865:4: (lv_type_1_0= ruleType )
            {
            // InternalAsam.g:1865:4: (lv_type_1_0= ruleType )
            // InternalAsam.g:1866:5: lv_type_1_0= ruleType
            {

            					newCompositeNode(grammarAccess.getSetTypeAccess().getTypeTypeParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_48);
            lv_type_1_0=ruleType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSetTypeRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_1_0,
            						"org.xtext.example.asam.Asam.Type");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,55,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getSetTypeAccess().getGreaterThanSignKeyword_2());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSetType"


    // $ANTLR start "ruleVTypes"
    // InternalAsam.g:1891:1: ruleVTypes returns [Enumerator current=null] : ( (enumLiteral_0= 'float' ) | (enumLiteral_1= 'long' ) | (enumLiteral_2= 'int' ) | (enumLiteral_3= 'char' ) | (enumLiteral_4= 'boolean' ) | (enumLiteral_5= 'byte' ) | (enumLiteral_6= 'String' ) ) ;
    public final Enumerator ruleVTypes() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;
        Token enumLiteral_6=null;


        	enterRule();

        try {
            // InternalAsam.g:1897:2: ( ( (enumLiteral_0= 'float' ) | (enumLiteral_1= 'long' ) | (enumLiteral_2= 'int' ) | (enumLiteral_3= 'char' ) | (enumLiteral_4= 'boolean' ) | (enumLiteral_5= 'byte' ) | (enumLiteral_6= 'String' ) ) )
            // InternalAsam.g:1898:2: ( (enumLiteral_0= 'float' ) | (enumLiteral_1= 'long' ) | (enumLiteral_2= 'int' ) | (enumLiteral_3= 'char' ) | (enumLiteral_4= 'boolean' ) | (enumLiteral_5= 'byte' ) | (enumLiteral_6= 'String' ) )
            {
            // InternalAsam.g:1898:2: ( (enumLiteral_0= 'float' ) | (enumLiteral_1= 'long' ) | (enumLiteral_2= 'int' ) | (enumLiteral_3= 'char' ) | (enumLiteral_4= 'boolean' ) | (enumLiteral_5= 'byte' ) | (enumLiteral_6= 'String' ) )
            int alt25=7;
            switch ( input.LA(1) ) {
            case 57:
                {
                alt25=1;
                }
                break;
            case 58:
                {
                alt25=2;
                }
                break;
            case 59:
                {
                alt25=3;
                }
                break;
            case 60:
                {
                alt25=4;
                }
                break;
            case 61:
                {
                alt25=5;
                }
                break;
            case 62:
                {
                alt25=6;
                }
                break;
            case 63:
                {
                alt25=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }

            switch (alt25) {
                case 1 :
                    // InternalAsam.g:1899:3: (enumLiteral_0= 'float' )
                    {
                    // InternalAsam.g:1899:3: (enumLiteral_0= 'float' )
                    // InternalAsam.g:1900:4: enumLiteral_0= 'float'
                    {
                    enumLiteral_0=(Token)match(input,57,FOLLOW_2); 

                    				current = grammarAccess.getVTypesAccess().getFLOATEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getVTypesAccess().getFLOATEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalAsam.g:1907:3: (enumLiteral_1= 'long' )
                    {
                    // InternalAsam.g:1907:3: (enumLiteral_1= 'long' )
                    // InternalAsam.g:1908:4: enumLiteral_1= 'long'
                    {
                    enumLiteral_1=(Token)match(input,58,FOLLOW_2); 

                    				current = grammarAccess.getVTypesAccess().getLONGEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getVTypesAccess().getLONGEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalAsam.g:1915:3: (enumLiteral_2= 'int' )
                    {
                    // InternalAsam.g:1915:3: (enumLiteral_2= 'int' )
                    // InternalAsam.g:1916:4: enumLiteral_2= 'int'
                    {
                    enumLiteral_2=(Token)match(input,59,FOLLOW_2); 

                    				current = grammarAccess.getVTypesAccess().getINTEGEREnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getVTypesAccess().getINTEGEREnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalAsam.g:1923:3: (enumLiteral_3= 'char' )
                    {
                    // InternalAsam.g:1923:3: (enumLiteral_3= 'char' )
                    // InternalAsam.g:1924:4: enumLiteral_3= 'char'
                    {
                    enumLiteral_3=(Token)match(input,60,FOLLOW_2); 

                    				current = grammarAccess.getVTypesAccess().getCHAREnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getVTypesAccess().getCHAREnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalAsam.g:1931:3: (enumLiteral_4= 'boolean' )
                    {
                    // InternalAsam.g:1931:3: (enumLiteral_4= 'boolean' )
                    // InternalAsam.g:1932:4: enumLiteral_4= 'boolean'
                    {
                    enumLiteral_4=(Token)match(input,61,FOLLOW_2); 

                    				current = grammarAccess.getVTypesAccess().getBOOLEANEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getVTypesAccess().getBOOLEANEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalAsam.g:1939:3: (enumLiteral_5= 'byte' )
                    {
                    // InternalAsam.g:1939:3: (enumLiteral_5= 'byte' )
                    // InternalAsam.g:1940:4: enumLiteral_5= 'byte'
                    {
                    enumLiteral_5=(Token)match(input,62,FOLLOW_2); 

                    				current = grammarAccess.getVTypesAccess().getBYTEEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getVTypesAccess().getBYTEEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalAsam.g:1947:3: (enumLiteral_6= 'String' )
                    {
                    // InternalAsam.g:1947:3: (enumLiteral_6= 'String' )
                    // InternalAsam.g:1948:4: enumLiteral_6= 'String'
                    {
                    enumLiteral_6=(Token)match(input,63,FOLLOW_2); 

                    				current = grammarAccess.getVTypesAccess().getSTRINGEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_6, grammarAccess.getVTypesAccess().getSTRINGEnumLiteralDeclaration_6());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVTypes"


    // $ANTLR start "ruleHttpMethods"
    // InternalAsam.g:1958:1: ruleHttpMethods returns [Enumerator current=null] : ( (enumLiteral_0= 'Get' ) | (enumLiteral_1= 'Delete' ) | (enumLiteral_2= 'Post' ) | (enumLiteral_3= 'Put' ) | (enumLiteral_4= 'Patch' ) ) ;
    public final Enumerator ruleHttpMethods() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;


        	enterRule();

        try {
            // InternalAsam.g:1964:2: ( ( (enumLiteral_0= 'Get' ) | (enumLiteral_1= 'Delete' ) | (enumLiteral_2= 'Post' ) | (enumLiteral_3= 'Put' ) | (enumLiteral_4= 'Patch' ) ) )
            // InternalAsam.g:1965:2: ( (enumLiteral_0= 'Get' ) | (enumLiteral_1= 'Delete' ) | (enumLiteral_2= 'Post' ) | (enumLiteral_3= 'Put' ) | (enumLiteral_4= 'Patch' ) )
            {
            // InternalAsam.g:1965:2: ( (enumLiteral_0= 'Get' ) | (enumLiteral_1= 'Delete' ) | (enumLiteral_2= 'Post' ) | (enumLiteral_3= 'Put' ) | (enumLiteral_4= 'Patch' ) )
            int alt26=5;
            switch ( input.LA(1) ) {
            case 64:
                {
                alt26=1;
                }
                break;
            case 65:
                {
                alt26=2;
                }
                break;
            case 66:
                {
                alt26=3;
                }
                break;
            case 67:
                {
                alt26=4;
                }
                break;
            case 68:
                {
                alt26=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }

            switch (alt26) {
                case 1 :
                    // InternalAsam.g:1966:3: (enumLiteral_0= 'Get' )
                    {
                    // InternalAsam.g:1966:3: (enumLiteral_0= 'Get' )
                    // InternalAsam.g:1967:4: enumLiteral_0= 'Get'
                    {
                    enumLiteral_0=(Token)match(input,64,FOLLOW_2); 

                    				current = grammarAccess.getHttpMethodsAccess().getGETEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getHttpMethodsAccess().getGETEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalAsam.g:1974:3: (enumLiteral_1= 'Delete' )
                    {
                    // InternalAsam.g:1974:3: (enumLiteral_1= 'Delete' )
                    // InternalAsam.g:1975:4: enumLiteral_1= 'Delete'
                    {
                    enumLiteral_1=(Token)match(input,65,FOLLOW_2); 

                    				current = grammarAccess.getHttpMethodsAccess().getDELETEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getHttpMethodsAccess().getDELETEEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalAsam.g:1982:3: (enumLiteral_2= 'Post' )
                    {
                    // InternalAsam.g:1982:3: (enumLiteral_2= 'Post' )
                    // InternalAsam.g:1983:4: enumLiteral_2= 'Post'
                    {
                    enumLiteral_2=(Token)match(input,66,FOLLOW_2); 

                    				current = grammarAccess.getHttpMethodsAccess().getPOSTEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getHttpMethodsAccess().getPOSTEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalAsam.g:1990:3: (enumLiteral_3= 'Put' )
                    {
                    // InternalAsam.g:1990:3: (enumLiteral_3= 'Put' )
                    // InternalAsam.g:1991:4: enumLiteral_3= 'Put'
                    {
                    enumLiteral_3=(Token)match(input,67,FOLLOW_2); 

                    				current = grammarAccess.getHttpMethodsAccess().getPUTEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getHttpMethodsAccess().getPUTEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalAsam.g:1998:3: (enumLiteral_4= 'Patch' )
                    {
                    // InternalAsam.g:1998:3: (enumLiteral_4= 'Patch' )
                    // InternalAsam.g:1999:4: enumLiteral_4= 'Patch'
                    {
                    enumLiteral_4=(Token)match(input,68,FOLLOW_2); 

                    				current = grammarAccess.getHttpMethodsAccess().getPATCHEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getHttpMethodsAccess().getPATCHEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleHttpMethods"


    // $ANTLR start "ruleRDBMS"
    // InternalAsam.g:2009:1: ruleRDBMS returns [Enumerator current=null] : ( (enumLiteral_0= 'Mysql' ) | (enumLiteral_1= 'Postgres' ) | (enumLiteral_2= 'Mariadb' ) | (enumLiteral_3= 'h2' ) | (enumLiteral_4= 'Oracle' ) ) ;
    public final Enumerator ruleRDBMS() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;


        	enterRule();

        try {
            // InternalAsam.g:2015:2: ( ( (enumLiteral_0= 'Mysql' ) | (enumLiteral_1= 'Postgres' ) | (enumLiteral_2= 'Mariadb' ) | (enumLiteral_3= 'h2' ) | (enumLiteral_4= 'Oracle' ) ) )
            // InternalAsam.g:2016:2: ( (enumLiteral_0= 'Mysql' ) | (enumLiteral_1= 'Postgres' ) | (enumLiteral_2= 'Mariadb' ) | (enumLiteral_3= 'h2' ) | (enumLiteral_4= 'Oracle' ) )
            {
            // InternalAsam.g:2016:2: ( (enumLiteral_0= 'Mysql' ) | (enumLiteral_1= 'Postgres' ) | (enumLiteral_2= 'Mariadb' ) | (enumLiteral_3= 'h2' ) | (enumLiteral_4= 'Oracle' ) )
            int alt27=5;
            switch ( input.LA(1) ) {
            case 69:
                {
                alt27=1;
                }
                break;
            case 70:
                {
                alt27=2;
                }
                break;
            case 71:
                {
                alt27=3;
                }
                break;
            case 72:
                {
                alt27=4;
                }
                break;
            case 73:
                {
                alt27=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }

            switch (alt27) {
                case 1 :
                    // InternalAsam.g:2017:3: (enumLiteral_0= 'Mysql' )
                    {
                    // InternalAsam.g:2017:3: (enumLiteral_0= 'Mysql' )
                    // InternalAsam.g:2018:4: enumLiteral_0= 'Mysql'
                    {
                    enumLiteral_0=(Token)match(input,69,FOLLOW_2); 

                    				current = grammarAccess.getRDBMSAccess().getMYSQLEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getRDBMSAccess().getMYSQLEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalAsam.g:2025:3: (enumLiteral_1= 'Postgres' )
                    {
                    // InternalAsam.g:2025:3: (enumLiteral_1= 'Postgres' )
                    // InternalAsam.g:2026:4: enumLiteral_1= 'Postgres'
                    {
                    enumLiteral_1=(Token)match(input,70,FOLLOW_2); 

                    				current = grammarAccess.getRDBMSAccess().getPOSTGRESEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getRDBMSAccess().getPOSTGRESEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalAsam.g:2033:3: (enumLiteral_2= 'Mariadb' )
                    {
                    // InternalAsam.g:2033:3: (enumLiteral_2= 'Mariadb' )
                    // InternalAsam.g:2034:4: enumLiteral_2= 'Mariadb'
                    {
                    enumLiteral_2=(Token)match(input,71,FOLLOW_2); 

                    				current = grammarAccess.getRDBMSAccess().getMARIADBEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getRDBMSAccess().getMARIADBEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalAsam.g:2041:3: (enumLiteral_3= 'h2' )
                    {
                    // InternalAsam.g:2041:3: (enumLiteral_3= 'h2' )
                    // InternalAsam.g:2042:4: enumLiteral_3= 'h2'
                    {
                    enumLiteral_3=(Token)match(input,72,FOLLOW_2); 

                    				current = grammarAccess.getRDBMSAccess().getH2EnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getRDBMSAccess().getH2EnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalAsam.g:2049:3: (enumLiteral_4= 'Oracle' )
                    {
                    // InternalAsam.g:2049:3: (enumLiteral_4= 'Oracle' )
                    // InternalAsam.g:2050:4: enumLiteral_4= 'Oracle'
                    {
                    enumLiteral_4=(Token)match(input,73,FOLLOW_2); 

                    				current = grammarAccess.getRDBMSAccess().getORACLEEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getRDBMSAccess().getORACLEEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRDBMS"


    // $ANTLR start "ruledbRelations"
    // InternalAsam.g:2060:1: ruledbRelations returns [Enumerator current=null] : ( (enumLiteral_0= 'ManyToMany' ) | (enumLiteral_1= 'ManyToOne' ) | (enumLiteral_2= 'OneToMany' ) ) ;
    public final Enumerator ruledbRelations() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalAsam.g:2066:2: ( ( (enumLiteral_0= 'ManyToMany' ) | (enumLiteral_1= 'ManyToOne' ) | (enumLiteral_2= 'OneToMany' ) ) )
            // InternalAsam.g:2067:2: ( (enumLiteral_0= 'ManyToMany' ) | (enumLiteral_1= 'ManyToOne' ) | (enumLiteral_2= 'OneToMany' ) )
            {
            // InternalAsam.g:2067:2: ( (enumLiteral_0= 'ManyToMany' ) | (enumLiteral_1= 'ManyToOne' ) | (enumLiteral_2= 'OneToMany' ) )
            int alt28=3;
            switch ( input.LA(1) ) {
            case 74:
                {
                alt28=1;
                }
                break;
            case 75:
                {
                alt28=2;
                }
                break;
            case 76:
                {
                alt28=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }

            switch (alt28) {
                case 1 :
                    // InternalAsam.g:2068:3: (enumLiteral_0= 'ManyToMany' )
                    {
                    // InternalAsam.g:2068:3: (enumLiteral_0= 'ManyToMany' )
                    // InternalAsam.g:2069:4: enumLiteral_0= 'ManyToMany'
                    {
                    enumLiteral_0=(Token)match(input,74,FOLLOW_2); 

                    				current = grammarAccess.getDbRelationsAccess().getM2MEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getDbRelationsAccess().getM2MEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalAsam.g:2076:3: (enumLiteral_1= 'ManyToOne' )
                    {
                    // InternalAsam.g:2076:3: (enumLiteral_1= 'ManyToOne' )
                    // InternalAsam.g:2077:4: enumLiteral_1= 'ManyToOne'
                    {
                    enumLiteral_1=(Token)match(input,75,FOLLOW_2); 

                    				current = grammarAccess.getDbRelationsAccess().getM2OEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getDbRelationsAccess().getM2OEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalAsam.g:2084:3: (enumLiteral_2= 'OneToMany' )
                    {
                    // InternalAsam.g:2084:3: (enumLiteral_2= 'OneToMany' )
                    // InternalAsam.g:2085:4: enumLiteral_2= 'OneToMany'
                    {
                    enumLiteral_2=(Token)match(input,76,FOLLOW_2); 

                    				current = grammarAccess.getDbRelationsAccess().getO2MEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getDbRelationsAccess().getO2MEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruledbRelations"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000AD0012002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000AD0002002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001C00L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x00000000004C0000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000440000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000340000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000240000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000000000L,0x00000000000003E0L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000020020000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000040010L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000040000040000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000040080L,0x000000000000001FL});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000040000L,0x000000000000001FL});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000032000040000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0xFE40000000000010L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000700000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0xFF40000000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000600000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0001000000000010L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0008000000040010L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0020000000000002L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0080000000000000L});

}