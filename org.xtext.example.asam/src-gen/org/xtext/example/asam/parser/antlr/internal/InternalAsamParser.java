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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_PATH", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'project'", "'relation'", "'between'", "'and'", "'config'", "'{'", "'}'", "'server'", "'port'", "'cpath'", "'database'", "'dbms'", "'dname'", "'dport'", "'username'", "'password'", "'entity'", "'inherits'", "'Id'", "'dto'", "'service'", "'pertainingTo'", "'controller'", "'mappingTo'", "'create'", "'entity:'", "'find'", "'delete'", "'operation'", "'returns'", "'raises'", "'implementation'", "'params'", "'('", "')'", "'action'", "'mappedAt'", "':'", "'default'", "'repository'", "'by'", "'customQuery'", "'List<'", "'>'", "'Set<'", "'float'", "'long'", "'int'", "'char'", "'boolean'", "'byte'", "'String'", "'Get'", "'Delete'", "'Post'", "'Put'", "'Patch'", "'Mysql'", "'Postgres'", "'Mariadb'", "'h2'", "'Oracle'", "'ManyToMany'", "'ManyToOne'", "'OneToMany'", "'RequestBody'", "'RequestParam'", "'PathVariable'"
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
    public static final int T__77=77;
    public static final int T__34=34;
    public static final int T__78=78;
    public static final int T__35=35;
    public static final int T__79=79;
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

                if ( (LA2_0==13||LA2_0==28||(LA2_0>=31 && LA2_0<=32)||LA2_0==51) ) {
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
    // InternalAsam.g:151:1: ruleElement returns [EObject current=null] : (this_Entity_0= ruleEntity | this_Service_1= ruleService | this_DTO_2= ruleDTO | this_Repository_3= ruleRepository | this_EntityRelationship_4= ruleEntityRelationship ) ;
    public final EObject ruleElement() throws RecognitionException {
        EObject current = null;

        EObject this_Entity_0 = null;

        EObject this_Service_1 = null;

        EObject this_DTO_2 = null;

        EObject this_Repository_3 = null;

        EObject this_EntityRelationship_4 = null;



        	enterRule();

        try {
            // InternalAsam.g:157:2: ( (this_Entity_0= ruleEntity | this_Service_1= ruleService | this_DTO_2= ruleDTO | this_Repository_3= ruleRepository | this_EntityRelationship_4= ruleEntityRelationship ) )
            // InternalAsam.g:158:2: (this_Entity_0= ruleEntity | this_Service_1= ruleService | this_DTO_2= ruleDTO | this_Repository_3= ruleRepository | this_EntityRelationship_4= ruleEntityRelationship )
            {
            // InternalAsam.g:158:2: (this_Entity_0= ruleEntity | this_Service_1= ruleService | this_DTO_2= ruleDTO | this_Repository_3= ruleRepository | this_EntityRelationship_4= ruleEntityRelationship )
            int alt3=5;
            switch ( input.LA(1) ) {
            case 28:
                {
                alt3=1;
                }
                break;
            case 32:
                {
                alt3=2;
                }
                break;
            case 31:
                {
                alt3=3;
                }
                break;
            case 51:
                {
                alt3=4;
                }
                break;
            case 13:
                {
                alt3=5;
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
                    // InternalAsam.g:177:3: this_DTO_2= ruleDTO
                    {

                    			newCompositeNode(grammarAccess.getElementAccess().getDTOParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_DTO_2=ruleDTO();

                    state._fsp--;


                    			current = this_DTO_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalAsam.g:186:3: this_Repository_3= ruleRepository
                    {

                    			newCompositeNode(grammarAccess.getElementAccess().getRepositoryParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_Repository_3=ruleRepository();

                    state._fsp--;


                    			current = this_Repository_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalAsam.g:195:3: this_EntityRelationship_4= ruleEntityRelationship
                    {

                    			newCompositeNode(grammarAccess.getElementAccess().getEntityRelationshipParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_EntityRelationship_4=ruleEntityRelationship();

                    state._fsp--;


                    			current = this_EntityRelationship_4;
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
    // InternalAsam.g:207:1: entryRuleEntityRelationship returns [EObject current=null] : iv_ruleEntityRelationship= ruleEntityRelationship EOF ;
    public final EObject entryRuleEntityRelationship() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntityRelationship = null;


        try {
            // InternalAsam.g:207:59: (iv_ruleEntityRelationship= ruleEntityRelationship EOF )
            // InternalAsam.g:208:2: iv_ruleEntityRelationship= ruleEntityRelationship EOF
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
    // InternalAsam.g:214:1: ruleEntityRelationship returns [EObject current=null] : (otherlv_0= 'relation' ( (lv_type_1_0= ruledbRelations ) ) otherlv_2= 'between' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'and' ( (otherlv_5= RULE_ID ) ) ) ;
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
            // InternalAsam.g:220:2: ( (otherlv_0= 'relation' ( (lv_type_1_0= ruledbRelations ) ) otherlv_2= 'between' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'and' ( (otherlv_5= RULE_ID ) ) ) )
            // InternalAsam.g:221:2: (otherlv_0= 'relation' ( (lv_type_1_0= ruledbRelations ) ) otherlv_2= 'between' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'and' ( (otherlv_5= RULE_ID ) ) )
            {
            // InternalAsam.g:221:2: (otherlv_0= 'relation' ( (lv_type_1_0= ruledbRelations ) ) otherlv_2= 'between' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'and' ( (otherlv_5= RULE_ID ) ) )
            // InternalAsam.g:222:3: otherlv_0= 'relation' ( (lv_type_1_0= ruledbRelations ) ) otherlv_2= 'between' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'and' ( (otherlv_5= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,13,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getEntityRelationshipAccess().getRelationKeyword_0());
            		
            // InternalAsam.g:226:3: ( (lv_type_1_0= ruledbRelations ) )
            // InternalAsam.g:227:4: (lv_type_1_0= ruledbRelations )
            {
            // InternalAsam.g:227:4: (lv_type_1_0= ruledbRelations )
            // InternalAsam.g:228:5: lv_type_1_0= ruledbRelations
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
            		
            // InternalAsam.g:249:3: ( (otherlv_3= RULE_ID ) )
            // InternalAsam.g:250:4: (otherlv_3= RULE_ID )
            {
            // InternalAsam.g:250:4: (otherlv_3= RULE_ID )
            // InternalAsam.g:251:5: otherlv_3= RULE_ID
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
            		
            // InternalAsam.g:266:3: ( (otherlv_5= RULE_ID ) )
            // InternalAsam.g:267:4: (otherlv_5= RULE_ID )
            {
            // InternalAsam.g:267:4: (otherlv_5= RULE_ID )
            // InternalAsam.g:268:5: otherlv_5= RULE_ID
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
    // InternalAsam.g:283:1: entryRuleConfiguration returns [EObject current=null] : iv_ruleConfiguration= ruleConfiguration EOF ;
    public final EObject entryRuleConfiguration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConfiguration = null;


        try {
            // InternalAsam.g:283:54: (iv_ruleConfiguration= ruleConfiguration EOF )
            // InternalAsam.g:284:2: iv_ruleConfiguration= ruleConfiguration EOF
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
    // InternalAsam.g:290:1: ruleConfiguration returns [EObject current=null] : (otherlv_0= 'config' otherlv_1= '{' ( (lv_server_2_0= ruleServerInfo ) )? ( (lv_database_3_0= ruleDatabaseInfo ) ) otherlv_4= '}' ) ;
    public final EObject ruleConfiguration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_4=null;
        EObject lv_server_2_0 = null;

        EObject lv_database_3_0 = null;



        	enterRule();

        try {
            // InternalAsam.g:296:2: ( (otherlv_0= 'config' otherlv_1= '{' ( (lv_server_2_0= ruleServerInfo ) )? ( (lv_database_3_0= ruleDatabaseInfo ) ) otherlv_4= '}' ) )
            // InternalAsam.g:297:2: (otherlv_0= 'config' otherlv_1= '{' ( (lv_server_2_0= ruleServerInfo ) )? ( (lv_database_3_0= ruleDatabaseInfo ) ) otherlv_4= '}' )
            {
            // InternalAsam.g:297:2: (otherlv_0= 'config' otherlv_1= '{' ( (lv_server_2_0= ruleServerInfo ) )? ( (lv_database_3_0= ruleDatabaseInfo ) ) otherlv_4= '}' )
            // InternalAsam.g:298:3: otherlv_0= 'config' otherlv_1= '{' ( (lv_server_2_0= ruleServerInfo ) )? ( (lv_database_3_0= ruleDatabaseInfo ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,16,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getConfigurationAccess().getConfigKeyword_0());
            		
            otherlv_1=(Token)match(input,17,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getConfigurationAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalAsam.g:306:3: ( (lv_server_2_0= ruleServerInfo ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==19) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalAsam.g:307:4: (lv_server_2_0= ruleServerInfo )
                    {
                    // InternalAsam.g:307:4: (lv_server_2_0= ruleServerInfo )
                    // InternalAsam.g:308:5: lv_server_2_0= ruleServerInfo
                    {

                    					newCompositeNode(grammarAccess.getConfigurationAccess().getServerServerInfoParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_10);
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

            // InternalAsam.g:325:3: ( (lv_database_3_0= ruleDatabaseInfo ) )
            // InternalAsam.g:326:4: (lv_database_3_0= ruleDatabaseInfo )
            {
            // InternalAsam.g:326:4: (lv_database_3_0= ruleDatabaseInfo )
            // InternalAsam.g:327:5: lv_database_3_0= ruleDatabaseInfo
            {

            					newCompositeNode(grammarAccess.getConfigurationAccess().getDatabaseDatabaseInfoParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_11);
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
    // InternalAsam.g:352:1: entryRuleServerInfo returns [EObject current=null] : iv_ruleServerInfo= ruleServerInfo EOF ;
    public final EObject entryRuleServerInfo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleServerInfo = null;


        try {
            // InternalAsam.g:352:51: (iv_ruleServerInfo= ruleServerInfo EOF )
            // InternalAsam.g:353:2: iv_ruleServerInfo= ruleServerInfo EOF
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
    // InternalAsam.g:359:1: ruleServerInfo returns [EObject current=null] : (otherlv_0= 'server' otherlv_1= '{' (otherlv_2= 'port' ( (lv_port_3_0= RULE_INT ) ) ) (otherlv_4= 'cpath' ( (lv_path_5_0= RULE_PATH ) ) )? otherlv_6= '}' ) ;
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
            // InternalAsam.g:365:2: ( (otherlv_0= 'server' otherlv_1= '{' (otherlv_2= 'port' ( (lv_port_3_0= RULE_INT ) ) ) (otherlv_4= 'cpath' ( (lv_path_5_0= RULE_PATH ) ) )? otherlv_6= '}' ) )
            // InternalAsam.g:366:2: (otherlv_0= 'server' otherlv_1= '{' (otherlv_2= 'port' ( (lv_port_3_0= RULE_INT ) ) ) (otherlv_4= 'cpath' ( (lv_path_5_0= RULE_PATH ) ) )? otherlv_6= '}' )
            {
            // InternalAsam.g:366:2: (otherlv_0= 'server' otherlv_1= '{' (otherlv_2= 'port' ( (lv_port_3_0= RULE_INT ) ) ) (otherlv_4= 'cpath' ( (lv_path_5_0= RULE_PATH ) ) )? otherlv_6= '}' )
            // InternalAsam.g:367:3: otherlv_0= 'server' otherlv_1= '{' (otherlv_2= 'port' ( (lv_port_3_0= RULE_INT ) ) ) (otherlv_4= 'cpath' ( (lv_path_5_0= RULE_PATH ) ) )? otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getServerInfoAccess().getServerKeyword_0());
            		
            otherlv_1=(Token)match(input,17,FOLLOW_12); 

            			newLeafNode(otherlv_1, grammarAccess.getServerInfoAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalAsam.g:375:3: (otherlv_2= 'port' ( (lv_port_3_0= RULE_INT ) ) )
            // InternalAsam.g:376:4: otherlv_2= 'port' ( (lv_port_3_0= RULE_INT ) )
            {
            otherlv_2=(Token)match(input,20,FOLLOW_13); 

            				newLeafNode(otherlv_2, grammarAccess.getServerInfoAccess().getPortKeyword_2_0());
            			
            // InternalAsam.g:380:4: ( (lv_port_3_0= RULE_INT ) )
            // InternalAsam.g:381:5: (lv_port_3_0= RULE_INT )
            {
            // InternalAsam.g:381:5: (lv_port_3_0= RULE_INT )
            // InternalAsam.g:382:6: lv_port_3_0= RULE_INT
            {
            lv_port_3_0=(Token)match(input,RULE_INT,FOLLOW_14); 

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

            // InternalAsam.g:399:3: (otherlv_4= 'cpath' ( (lv_path_5_0= RULE_PATH ) ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==21) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalAsam.g:400:4: otherlv_4= 'cpath' ( (lv_path_5_0= RULE_PATH ) )
                    {
                    otherlv_4=(Token)match(input,21,FOLLOW_15); 

                    				newLeafNode(otherlv_4, grammarAccess.getServerInfoAccess().getCpathKeyword_3_0());
                    			
                    // InternalAsam.g:404:4: ( (lv_path_5_0= RULE_PATH ) )
                    // InternalAsam.g:405:5: (lv_path_5_0= RULE_PATH )
                    {
                    // InternalAsam.g:405:5: (lv_path_5_0= RULE_PATH )
                    // InternalAsam.g:406:6: lv_path_5_0= RULE_PATH
                    {
                    lv_path_5_0=(Token)match(input,RULE_PATH,FOLLOW_11); 

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
    // InternalAsam.g:431:1: entryRuleDatabaseInfo returns [EObject current=null] : iv_ruleDatabaseInfo= ruleDatabaseInfo EOF ;
    public final EObject entryRuleDatabaseInfo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDatabaseInfo = null;


        try {
            // InternalAsam.g:431:53: (iv_ruleDatabaseInfo= ruleDatabaseInfo EOF )
            // InternalAsam.g:432:2: iv_ruleDatabaseInfo= ruleDatabaseInfo EOF
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
    // InternalAsam.g:438:1: ruleDatabaseInfo returns [EObject current=null] : (otherlv_0= 'database' otherlv_1= '{' otherlv_2= 'dbms' ( (lv_type_3_0= ruleRDBMS ) ) otherlv_4= 'dname' ( (lv_nom_5_0= RULE_ID ) ) otherlv_6= 'dport' ( (lv_port_7_0= RULE_INT ) ) otherlv_8= 'username' ( (lv_username_9_0= RULE_ID ) ) otherlv_10= 'password' ( (lv_password_11_0= RULE_ID ) ) otherlv_12= '}' ) ;
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
            // InternalAsam.g:444:2: ( (otherlv_0= 'database' otherlv_1= '{' otherlv_2= 'dbms' ( (lv_type_3_0= ruleRDBMS ) ) otherlv_4= 'dname' ( (lv_nom_5_0= RULE_ID ) ) otherlv_6= 'dport' ( (lv_port_7_0= RULE_INT ) ) otherlv_8= 'username' ( (lv_username_9_0= RULE_ID ) ) otherlv_10= 'password' ( (lv_password_11_0= RULE_ID ) ) otherlv_12= '}' ) )
            // InternalAsam.g:445:2: (otherlv_0= 'database' otherlv_1= '{' otherlv_2= 'dbms' ( (lv_type_3_0= ruleRDBMS ) ) otherlv_4= 'dname' ( (lv_nom_5_0= RULE_ID ) ) otherlv_6= 'dport' ( (lv_port_7_0= RULE_INT ) ) otherlv_8= 'username' ( (lv_username_9_0= RULE_ID ) ) otherlv_10= 'password' ( (lv_password_11_0= RULE_ID ) ) otherlv_12= '}' )
            {
            // InternalAsam.g:445:2: (otherlv_0= 'database' otherlv_1= '{' otherlv_2= 'dbms' ( (lv_type_3_0= ruleRDBMS ) ) otherlv_4= 'dname' ( (lv_nom_5_0= RULE_ID ) ) otherlv_6= 'dport' ( (lv_port_7_0= RULE_INT ) ) otherlv_8= 'username' ( (lv_username_9_0= RULE_ID ) ) otherlv_10= 'password' ( (lv_password_11_0= RULE_ID ) ) otherlv_12= '}' )
            // InternalAsam.g:446:3: otherlv_0= 'database' otherlv_1= '{' otherlv_2= 'dbms' ( (lv_type_3_0= ruleRDBMS ) ) otherlv_4= 'dname' ( (lv_nom_5_0= RULE_ID ) ) otherlv_6= 'dport' ( (lv_port_7_0= RULE_INT ) ) otherlv_8= 'username' ( (lv_username_9_0= RULE_ID ) ) otherlv_10= 'password' ( (lv_password_11_0= RULE_ID ) ) otherlv_12= '}'
            {
            otherlv_0=(Token)match(input,22,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getDatabaseInfoAccess().getDatabaseKeyword_0());
            		
            otherlv_1=(Token)match(input,17,FOLLOW_16); 

            			newLeafNode(otherlv_1, grammarAccess.getDatabaseInfoAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,23,FOLLOW_17); 

            			newLeafNode(otherlv_2, grammarAccess.getDatabaseInfoAccess().getDbmsKeyword_2());
            		
            // InternalAsam.g:458:3: ( (lv_type_3_0= ruleRDBMS ) )
            // InternalAsam.g:459:4: (lv_type_3_0= ruleRDBMS )
            {
            // InternalAsam.g:459:4: (lv_type_3_0= ruleRDBMS )
            // InternalAsam.g:460:5: lv_type_3_0= ruleRDBMS
            {

            					newCompositeNode(grammarAccess.getDatabaseInfoAccess().getTypeRDBMSEnumRuleCall_3_0());
            				
            pushFollow(FOLLOW_18);
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
            		
            // InternalAsam.g:481:3: ( (lv_nom_5_0= RULE_ID ) )
            // InternalAsam.g:482:4: (lv_nom_5_0= RULE_ID )
            {
            // InternalAsam.g:482:4: (lv_nom_5_0= RULE_ID )
            // InternalAsam.g:483:5: lv_nom_5_0= RULE_ID
            {
            lv_nom_5_0=(Token)match(input,RULE_ID,FOLLOW_19); 

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

            otherlv_6=(Token)match(input,25,FOLLOW_13); 

            			newLeafNode(otherlv_6, grammarAccess.getDatabaseInfoAccess().getDportKeyword_6());
            		
            // InternalAsam.g:503:3: ( (lv_port_7_0= RULE_INT ) )
            // InternalAsam.g:504:4: (lv_port_7_0= RULE_INT )
            {
            // InternalAsam.g:504:4: (lv_port_7_0= RULE_INT )
            // InternalAsam.g:505:5: lv_port_7_0= RULE_INT
            {
            lv_port_7_0=(Token)match(input,RULE_INT,FOLLOW_20); 

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
            		
            // InternalAsam.g:525:3: ( (lv_username_9_0= RULE_ID ) )
            // InternalAsam.g:526:4: (lv_username_9_0= RULE_ID )
            {
            // InternalAsam.g:526:4: (lv_username_9_0= RULE_ID )
            // InternalAsam.g:527:5: lv_username_9_0= RULE_ID
            {
            lv_username_9_0=(Token)match(input,RULE_ID,FOLLOW_21); 

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
            		
            // InternalAsam.g:547:3: ( (lv_password_11_0= RULE_ID ) )
            // InternalAsam.g:548:4: (lv_password_11_0= RULE_ID )
            {
            // InternalAsam.g:548:4: (lv_password_11_0= RULE_ID )
            // InternalAsam.g:549:5: lv_password_11_0= RULE_ID
            {
            lv_password_11_0=(Token)match(input,RULE_ID,FOLLOW_11); 

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
    // InternalAsam.g:573:1: entryRuleEntity returns [EObject current=null] : iv_ruleEntity= ruleEntity EOF ;
    public final EObject entryRuleEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntity = null;


        try {
            // InternalAsam.g:573:47: (iv_ruleEntity= ruleEntity EOF )
            // InternalAsam.g:574:2: iv_ruleEntity= ruleEntity EOF
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
    // InternalAsam.g:580:1: ruleEntity returns [EObject current=null] : (otherlv_0= 'entity' ( (lv_nom_1_0= RULE_ID ) ) (otherlv_2= 'inherits' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_ident_5_0= ruleIdentifier ) ) ( (lv_properties_6_0= ruleProperty ) )* ( (lv_repo_7_0= ruleRepository ) )? ( (lv_control_8_0= ruleController ) ) otherlv_9= '}' ) ;
    public final EObject ruleEntity() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_nom_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_9=null;
        EObject lv_ident_5_0 = null;

        EObject lv_properties_6_0 = null;

        EObject lv_repo_7_0 = null;

        EObject lv_control_8_0 = null;



        	enterRule();

        try {
            // InternalAsam.g:586:2: ( (otherlv_0= 'entity' ( (lv_nom_1_0= RULE_ID ) ) (otherlv_2= 'inherits' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_ident_5_0= ruleIdentifier ) ) ( (lv_properties_6_0= ruleProperty ) )* ( (lv_repo_7_0= ruleRepository ) )? ( (lv_control_8_0= ruleController ) ) otherlv_9= '}' ) )
            // InternalAsam.g:587:2: (otherlv_0= 'entity' ( (lv_nom_1_0= RULE_ID ) ) (otherlv_2= 'inherits' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_ident_5_0= ruleIdentifier ) ) ( (lv_properties_6_0= ruleProperty ) )* ( (lv_repo_7_0= ruleRepository ) )? ( (lv_control_8_0= ruleController ) ) otherlv_9= '}' )
            {
            // InternalAsam.g:587:2: (otherlv_0= 'entity' ( (lv_nom_1_0= RULE_ID ) ) (otherlv_2= 'inherits' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_ident_5_0= ruleIdentifier ) ) ( (lv_properties_6_0= ruleProperty ) )* ( (lv_repo_7_0= ruleRepository ) )? ( (lv_control_8_0= ruleController ) ) otherlv_9= '}' )
            // InternalAsam.g:588:3: otherlv_0= 'entity' ( (lv_nom_1_0= RULE_ID ) ) (otherlv_2= 'inherits' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_ident_5_0= ruleIdentifier ) ) ( (lv_properties_6_0= ruleProperty ) )* ( (lv_repo_7_0= ruleRepository ) )? ( (lv_control_8_0= ruleController ) ) otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,28,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getEntityAccess().getEntityKeyword_0());
            		
            // InternalAsam.g:592:3: ( (lv_nom_1_0= RULE_ID ) )
            // InternalAsam.g:593:4: (lv_nom_1_0= RULE_ID )
            {
            // InternalAsam.g:593:4: (lv_nom_1_0= RULE_ID )
            // InternalAsam.g:594:5: lv_nom_1_0= RULE_ID
            {
            lv_nom_1_0=(Token)match(input,RULE_ID,FOLLOW_22); 

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

            // InternalAsam.g:610:3: (otherlv_2= 'inherits' ( (otherlv_3= RULE_ID ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==29) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalAsam.g:611:4: otherlv_2= 'inherits' ( (otherlv_3= RULE_ID ) )
                    {
                    otherlv_2=(Token)match(input,29,FOLLOW_3); 

                    				newLeafNode(otherlv_2, grammarAccess.getEntityAccess().getInheritsKeyword_2_0());
                    			
                    // InternalAsam.g:615:4: ( (otherlv_3= RULE_ID ) )
                    // InternalAsam.g:616:5: (otherlv_3= RULE_ID )
                    {
                    // InternalAsam.g:616:5: (otherlv_3= RULE_ID )
                    // InternalAsam.g:617:6: otherlv_3= RULE_ID
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

            otherlv_4=(Token)match(input,17,FOLLOW_23); 

            			newLeafNode(otherlv_4, grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalAsam.g:633:3: ( (lv_ident_5_0= ruleIdentifier ) )
            // InternalAsam.g:634:4: (lv_ident_5_0= ruleIdentifier )
            {
            // InternalAsam.g:634:4: (lv_ident_5_0= ruleIdentifier )
            // InternalAsam.g:635:5: lv_ident_5_0= ruleIdentifier
            {

            					newCompositeNode(grammarAccess.getEntityAccess().getIdentIdentifierParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_24);
            lv_ident_5_0=ruleIdentifier();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEntityRule());
            					}
            					set(
            						current,
            						"ident",
            						lv_ident_5_0,
            						"org.xtext.example.asam.Asam.Identifier");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalAsam.g:652:3: ( (lv_properties_6_0= ruleProperty ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_ID) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalAsam.g:653:4: (lv_properties_6_0= ruleProperty )
            	    {
            	    // InternalAsam.g:653:4: (lv_properties_6_0= ruleProperty )
            	    // InternalAsam.g:654:5: lv_properties_6_0= ruleProperty
            	    {

            	    					newCompositeNode(grammarAccess.getEntityAccess().getPropertiesPropertyParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_24);
            	    lv_properties_6_0=ruleProperty();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getEntityRule());
            	    					}
            	    					add(
            	    						current,
            	    						"properties",
            	    						lv_properties_6_0,
            	    						"org.xtext.example.asam.Asam.Property");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            // InternalAsam.g:671:3: ( (lv_repo_7_0= ruleRepository ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==51) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalAsam.g:672:4: (lv_repo_7_0= ruleRepository )
                    {
                    // InternalAsam.g:672:4: (lv_repo_7_0= ruleRepository )
                    // InternalAsam.g:673:5: lv_repo_7_0= ruleRepository
                    {

                    					newCompositeNode(grammarAccess.getEntityAccess().getRepoRepositoryParserRuleCall_6_0());
                    				
                    pushFollow(FOLLOW_24);
                    lv_repo_7_0=ruleRepository();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getEntityRule());
                    					}
                    					set(
                    						current,
                    						"repo",
                    						lv_repo_7_0,
                    						"org.xtext.example.asam.Asam.Repository");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalAsam.g:690:3: ( (lv_control_8_0= ruleController ) )
            // InternalAsam.g:691:4: (lv_control_8_0= ruleController )
            {
            // InternalAsam.g:691:4: (lv_control_8_0= ruleController )
            // InternalAsam.g:692:5: lv_control_8_0= ruleController
            {

            					newCompositeNode(grammarAccess.getEntityAccess().getControlControllerParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_11);
            lv_control_8_0=ruleController();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEntityRule());
            					}
            					set(
            						current,
            						"control",
            						lv_control_8_0,
            						"org.xtext.example.asam.Asam.Controller");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_9=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_8());
            		

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


    // $ANTLR start "entryRuleIdentifier"
    // InternalAsam.g:717:1: entryRuleIdentifier returns [EObject current=null] : iv_ruleIdentifier= ruleIdentifier EOF ;
    public final EObject entryRuleIdentifier() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIdentifier = null;


        try {
            // InternalAsam.g:717:51: (iv_ruleIdentifier= ruleIdentifier EOF )
            // InternalAsam.g:718:2: iv_ruleIdentifier= ruleIdentifier EOF
            {
             newCompositeNode(grammarAccess.getIdentifierRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIdentifier=ruleIdentifier();

            state._fsp--;

             current =iv_ruleIdentifier; 
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
    // $ANTLR end "entryRuleIdentifier"


    // $ANTLR start "ruleIdentifier"
    // InternalAsam.g:724:1: ruleIdentifier returns [EObject current=null] : (otherlv_0= 'Id' ( (lv_nom_1_0= RULE_ID ) ) ( (lv_type_2_0= ruleVTypes ) ) ) ;
    public final EObject ruleIdentifier() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_nom_1_0=null;
        Enumerator lv_type_2_0 = null;



        	enterRule();

        try {
            // InternalAsam.g:730:2: ( (otherlv_0= 'Id' ( (lv_nom_1_0= RULE_ID ) ) ( (lv_type_2_0= ruleVTypes ) ) ) )
            // InternalAsam.g:731:2: (otherlv_0= 'Id' ( (lv_nom_1_0= RULE_ID ) ) ( (lv_type_2_0= ruleVTypes ) ) )
            {
            // InternalAsam.g:731:2: (otherlv_0= 'Id' ( (lv_nom_1_0= RULE_ID ) ) ( (lv_type_2_0= ruleVTypes ) ) )
            // InternalAsam.g:732:3: otherlv_0= 'Id' ( (lv_nom_1_0= RULE_ID ) ) ( (lv_type_2_0= ruleVTypes ) )
            {
            otherlv_0=(Token)match(input,30,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getIdentifierAccess().getIdKeyword_0());
            		
            // InternalAsam.g:736:3: ( (lv_nom_1_0= RULE_ID ) )
            // InternalAsam.g:737:4: (lv_nom_1_0= RULE_ID )
            {
            // InternalAsam.g:737:4: (lv_nom_1_0= RULE_ID )
            // InternalAsam.g:738:5: lv_nom_1_0= RULE_ID
            {
            lv_nom_1_0=(Token)match(input,RULE_ID,FOLLOW_25); 

            					newLeafNode(lv_nom_1_0, grammarAccess.getIdentifierAccess().getNomIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getIdentifierRule());
            					}
            					setWithLastConsumed(
            						current,
            						"nom",
            						lv_nom_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalAsam.g:754:3: ( (lv_type_2_0= ruleVTypes ) )
            // InternalAsam.g:755:4: (lv_type_2_0= ruleVTypes )
            {
            // InternalAsam.g:755:4: (lv_type_2_0= ruleVTypes )
            // InternalAsam.g:756:5: lv_type_2_0= ruleVTypes
            {

            					newCompositeNode(grammarAccess.getIdentifierAccess().getTypeVTypesEnumRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_type_2_0=ruleVTypes();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIdentifierRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_2_0,
            						"org.xtext.example.asam.Asam.VTypes");
            					afterParserOrEnumRuleCall();
            				

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
    // $ANTLR end "ruleIdentifier"


    // $ANTLR start "entryRuleDTO"
    // InternalAsam.g:777:1: entryRuleDTO returns [EObject current=null] : iv_ruleDTO= ruleDTO EOF ;
    public final EObject entryRuleDTO() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDTO = null;


        try {
            // InternalAsam.g:777:44: (iv_ruleDTO= ruleDTO EOF )
            // InternalAsam.g:778:2: iv_ruleDTO= ruleDTO EOF
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
    // InternalAsam.g:784:1: ruleDTO returns [EObject current=null] : (otherlv_0= 'dto' ( (lv_nom_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_properties_3_0= ruleProperty ) )* otherlv_4= '}' ) ;
    public final EObject ruleDTO() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_nom_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_properties_3_0 = null;



        	enterRule();

        try {
            // InternalAsam.g:790:2: ( (otherlv_0= 'dto' ( (lv_nom_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_properties_3_0= ruleProperty ) )* otherlv_4= '}' ) )
            // InternalAsam.g:791:2: (otherlv_0= 'dto' ( (lv_nom_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_properties_3_0= ruleProperty ) )* otherlv_4= '}' )
            {
            // InternalAsam.g:791:2: (otherlv_0= 'dto' ( (lv_nom_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_properties_3_0= ruleProperty ) )* otherlv_4= '}' )
            // InternalAsam.g:792:3: otherlv_0= 'dto' ( (lv_nom_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_properties_3_0= ruleProperty ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,31,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getDTOAccess().getDtoKeyword_0());
            		
            // InternalAsam.g:796:3: ( (lv_nom_1_0= RULE_ID ) )
            // InternalAsam.g:797:4: (lv_nom_1_0= RULE_ID )
            {
            // InternalAsam.g:797:4: (lv_nom_1_0= RULE_ID )
            // InternalAsam.g:798:5: lv_nom_1_0= RULE_ID
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

            otherlv_2=(Token)match(input,17,FOLLOW_26); 

            			newLeafNode(otherlv_2, grammarAccess.getDTOAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalAsam.g:818:3: ( (lv_properties_3_0= ruleProperty ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_ID) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalAsam.g:819:4: (lv_properties_3_0= ruleProperty )
            	    {
            	    // InternalAsam.g:819:4: (lv_properties_3_0= ruleProperty )
            	    // InternalAsam.g:820:5: lv_properties_3_0= ruleProperty
            	    {

            	    					newCompositeNode(grammarAccess.getDTOAccess().getPropertiesPropertyParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_26);
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
            	    break loop9;
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
    // InternalAsam.g:845:1: entryRuleService returns [EObject current=null] : iv_ruleService= ruleService EOF ;
    public final EObject entryRuleService() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleService = null;


        try {
            // InternalAsam.g:845:48: (iv_ruleService= ruleService EOF )
            // InternalAsam.g:846:2: iv_ruleService= ruleService EOF
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
    // InternalAsam.g:852:1: ruleService returns [EObject current=null] : (otherlv_0= 'service' ( (lv_nom_1_0= RULE_ID ) ) otherlv_2= 'pertainingTo' ( (otherlv_3= RULE_ID ) ) otherlv_4= '{' ( (lv_actions_5_0= ruleServiceAction ) )* otherlv_6= '}' ) ;
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
            // InternalAsam.g:858:2: ( (otherlv_0= 'service' ( (lv_nom_1_0= RULE_ID ) ) otherlv_2= 'pertainingTo' ( (otherlv_3= RULE_ID ) ) otherlv_4= '{' ( (lv_actions_5_0= ruleServiceAction ) )* otherlv_6= '}' ) )
            // InternalAsam.g:859:2: (otherlv_0= 'service' ( (lv_nom_1_0= RULE_ID ) ) otherlv_2= 'pertainingTo' ( (otherlv_3= RULE_ID ) ) otherlv_4= '{' ( (lv_actions_5_0= ruleServiceAction ) )* otherlv_6= '}' )
            {
            // InternalAsam.g:859:2: (otherlv_0= 'service' ( (lv_nom_1_0= RULE_ID ) ) otherlv_2= 'pertainingTo' ( (otherlv_3= RULE_ID ) ) otherlv_4= '{' ( (lv_actions_5_0= ruleServiceAction ) )* otherlv_6= '}' )
            // InternalAsam.g:860:3: otherlv_0= 'service' ( (lv_nom_1_0= RULE_ID ) ) otherlv_2= 'pertainingTo' ( (otherlv_3= RULE_ID ) ) otherlv_4= '{' ( (lv_actions_5_0= ruleServiceAction ) )* otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,32,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getServiceAccess().getServiceKeyword_0());
            		
            // InternalAsam.g:864:3: ( (lv_nom_1_0= RULE_ID ) )
            // InternalAsam.g:865:4: (lv_nom_1_0= RULE_ID )
            {
            // InternalAsam.g:865:4: (lv_nom_1_0= RULE_ID )
            // InternalAsam.g:866:5: lv_nom_1_0= RULE_ID
            {
            lv_nom_1_0=(Token)match(input,RULE_ID,FOLLOW_27); 

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

            otherlv_2=(Token)match(input,33,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getServiceAccess().getPertainingToKeyword_2());
            		
            // InternalAsam.g:886:3: ( (otherlv_3= RULE_ID ) )
            // InternalAsam.g:887:4: (otherlv_3= RULE_ID )
            {
            // InternalAsam.g:887:4: (otherlv_3= RULE_ID )
            // InternalAsam.g:888:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getServiceRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_9); 

            					newLeafNode(otherlv_3, grammarAccess.getServiceAccess().getEntityEntityCrossReference_3_0());
            				

            }


            }

            otherlv_4=(Token)match(input,17,FOLLOW_28); 

            			newLeafNode(otherlv_4, grammarAccess.getServiceAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalAsam.g:903:3: ( (lv_actions_5_0= ruleServiceAction ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==40) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalAsam.g:904:4: (lv_actions_5_0= ruleServiceAction )
            	    {
            	    // InternalAsam.g:904:4: (lv_actions_5_0= ruleServiceAction )
            	    // InternalAsam.g:905:5: lv_actions_5_0= ruleServiceAction
            	    {

            	    					newCompositeNode(grammarAccess.getServiceAccess().getActionsServiceActionParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_28);
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
            	    break loop10;
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
    // InternalAsam.g:930:1: entryRuleController returns [EObject current=null] : iv_ruleController= ruleController EOF ;
    public final EObject entryRuleController() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleController = null;


        try {
            // InternalAsam.g:930:51: (iv_ruleController= ruleController EOF )
            // InternalAsam.g:931:2: iv_ruleController= ruleController EOF
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
    // InternalAsam.g:937:1: ruleController returns [EObject current=null] : (otherlv_0= 'controller' otherlv_1= 'mappingTo' ( (otherlv_2= RULE_ID ) ) otherlv_3= '{' ( (lv_baseUrl_4_0= RULE_PATH ) )? ( (lv_cactions_5_0= ruleCustomAction ) )* (otherlv_6= 'create' otherlv_7= 'entity:' ( (lv_cparam_8_0= ruleParamTrasfert ) ) )? (otherlv_9= 'find' otherlv_10= 'entity:' ( (lv_fparam_11_0= ruleParamTrasfert ) ) )? (otherlv_12= 'delete' otherlv_13= 'entity:' ( (lv_dparam_14_0= ruleParamTrasfert ) ) )? otherlv_15= '}' ) ;
    public final EObject ruleController() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_baseUrl_4_0=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        EObject lv_cactions_5_0 = null;

        Enumerator lv_cparam_8_0 = null;

        Enumerator lv_fparam_11_0 = null;

        Enumerator lv_dparam_14_0 = null;



        	enterRule();

        try {
            // InternalAsam.g:943:2: ( (otherlv_0= 'controller' otherlv_1= 'mappingTo' ( (otherlv_2= RULE_ID ) ) otherlv_3= '{' ( (lv_baseUrl_4_0= RULE_PATH ) )? ( (lv_cactions_5_0= ruleCustomAction ) )* (otherlv_6= 'create' otherlv_7= 'entity:' ( (lv_cparam_8_0= ruleParamTrasfert ) ) )? (otherlv_9= 'find' otherlv_10= 'entity:' ( (lv_fparam_11_0= ruleParamTrasfert ) ) )? (otherlv_12= 'delete' otherlv_13= 'entity:' ( (lv_dparam_14_0= ruleParamTrasfert ) ) )? otherlv_15= '}' ) )
            // InternalAsam.g:944:2: (otherlv_0= 'controller' otherlv_1= 'mappingTo' ( (otherlv_2= RULE_ID ) ) otherlv_3= '{' ( (lv_baseUrl_4_0= RULE_PATH ) )? ( (lv_cactions_5_0= ruleCustomAction ) )* (otherlv_6= 'create' otherlv_7= 'entity:' ( (lv_cparam_8_0= ruleParamTrasfert ) ) )? (otherlv_9= 'find' otherlv_10= 'entity:' ( (lv_fparam_11_0= ruleParamTrasfert ) ) )? (otherlv_12= 'delete' otherlv_13= 'entity:' ( (lv_dparam_14_0= ruleParamTrasfert ) ) )? otherlv_15= '}' )
            {
            // InternalAsam.g:944:2: (otherlv_0= 'controller' otherlv_1= 'mappingTo' ( (otherlv_2= RULE_ID ) ) otherlv_3= '{' ( (lv_baseUrl_4_0= RULE_PATH ) )? ( (lv_cactions_5_0= ruleCustomAction ) )* (otherlv_6= 'create' otherlv_7= 'entity:' ( (lv_cparam_8_0= ruleParamTrasfert ) ) )? (otherlv_9= 'find' otherlv_10= 'entity:' ( (lv_fparam_11_0= ruleParamTrasfert ) ) )? (otherlv_12= 'delete' otherlv_13= 'entity:' ( (lv_dparam_14_0= ruleParamTrasfert ) ) )? otherlv_15= '}' )
            // InternalAsam.g:945:3: otherlv_0= 'controller' otherlv_1= 'mappingTo' ( (otherlv_2= RULE_ID ) ) otherlv_3= '{' ( (lv_baseUrl_4_0= RULE_PATH ) )? ( (lv_cactions_5_0= ruleCustomAction ) )* (otherlv_6= 'create' otherlv_7= 'entity:' ( (lv_cparam_8_0= ruleParamTrasfert ) ) )? (otherlv_9= 'find' otherlv_10= 'entity:' ( (lv_fparam_11_0= ruleParamTrasfert ) ) )? (otherlv_12= 'delete' otherlv_13= 'entity:' ( (lv_dparam_14_0= ruleParamTrasfert ) ) )? otherlv_15= '}'
            {
            otherlv_0=(Token)match(input,34,FOLLOW_29); 

            			newLeafNode(otherlv_0, grammarAccess.getControllerAccess().getControllerKeyword_0());
            		
            otherlv_1=(Token)match(input,35,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getControllerAccess().getMappingToKeyword_1());
            		
            // InternalAsam.g:953:3: ( (otherlv_2= RULE_ID ) )
            // InternalAsam.g:954:4: (otherlv_2= RULE_ID )
            {
            // InternalAsam.g:954:4: (otherlv_2= RULE_ID )
            // InternalAsam.g:955:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getControllerRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_9); 

            					newLeafNode(otherlv_2, grammarAccess.getControllerAccess().getEntityEntityCrossReference_2_0());
            				

            }


            }

            otherlv_3=(Token)match(input,17,FOLLOW_30); 

            			newLeafNode(otherlv_3, grammarAccess.getControllerAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalAsam.g:970:3: ( (lv_baseUrl_4_0= RULE_PATH ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_PATH) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalAsam.g:971:4: (lv_baseUrl_4_0= RULE_PATH )
                    {
                    // InternalAsam.g:971:4: (lv_baseUrl_4_0= RULE_PATH )
                    // InternalAsam.g:972:5: lv_baseUrl_4_0= RULE_PATH
                    {
                    lv_baseUrl_4_0=(Token)match(input,RULE_PATH,FOLLOW_31); 

                    					newLeafNode(lv_baseUrl_4_0, grammarAccess.getControllerAccess().getBaseUrlPATHTerminalRuleCall_4_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getControllerRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"baseUrl",
                    						lv_baseUrl_4_0,
                    						"org.xtext.example.asam.Asam.PATH");
                    				

                    }


                    }
                    break;

            }

            // InternalAsam.g:988:3: ( (lv_cactions_5_0= ruleCustomAction ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>=64 && LA12_0<=68)) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalAsam.g:989:4: (lv_cactions_5_0= ruleCustomAction )
            	    {
            	    // InternalAsam.g:989:4: (lv_cactions_5_0= ruleCustomAction )
            	    // InternalAsam.g:990:5: lv_cactions_5_0= ruleCustomAction
            	    {

            	    					newCompositeNode(grammarAccess.getControllerAccess().getCactionsCustomActionParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_31);
            	    lv_cactions_5_0=ruleCustomAction();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getControllerRule());
            	    					}
            	    					add(
            	    						current,
            	    						"cactions",
            	    						lv_cactions_5_0,
            	    						"org.xtext.example.asam.Asam.CustomAction");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            // InternalAsam.g:1007:3: (otherlv_6= 'create' otherlv_7= 'entity:' ( (lv_cparam_8_0= ruleParamTrasfert ) ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==36) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalAsam.g:1008:4: otherlv_6= 'create' otherlv_7= 'entity:' ( (lv_cparam_8_0= ruleParamTrasfert ) )
                    {
                    otherlv_6=(Token)match(input,36,FOLLOW_32); 

                    				newLeafNode(otherlv_6, grammarAccess.getControllerAccess().getCreateKeyword_6_0());
                    			
                    otherlv_7=(Token)match(input,37,FOLLOW_33); 

                    				newLeafNode(otherlv_7, grammarAccess.getControllerAccess().getEntityKeyword_6_1());
                    			
                    // InternalAsam.g:1016:4: ( (lv_cparam_8_0= ruleParamTrasfert ) )
                    // InternalAsam.g:1017:5: (lv_cparam_8_0= ruleParamTrasfert )
                    {
                    // InternalAsam.g:1017:5: (lv_cparam_8_0= ruleParamTrasfert )
                    // InternalAsam.g:1018:6: lv_cparam_8_0= ruleParamTrasfert
                    {

                    						newCompositeNode(grammarAccess.getControllerAccess().getCparamParamTrasfertEnumRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_34);
                    lv_cparam_8_0=ruleParamTrasfert();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getControllerRule());
                    						}
                    						set(
                    							current,
                    							"cparam",
                    							lv_cparam_8_0,
                    							"org.xtext.example.asam.Asam.ParamTrasfert");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalAsam.g:1036:3: (otherlv_9= 'find' otherlv_10= 'entity:' ( (lv_fparam_11_0= ruleParamTrasfert ) ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==38) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalAsam.g:1037:4: otherlv_9= 'find' otherlv_10= 'entity:' ( (lv_fparam_11_0= ruleParamTrasfert ) )
                    {
                    otherlv_9=(Token)match(input,38,FOLLOW_32); 

                    				newLeafNode(otherlv_9, grammarAccess.getControllerAccess().getFindKeyword_7_0());
                    			
                    otherlv_10=(Token)match(input,37,FOLLOW_33); 

                    				newLeafNode(otherlv_10, grammarAccess.getControllerAccess().getEntityKeyword_7_1());
                    			
                    // InternalAsam.g:1045:4: ( (lv_fparam_11_0= ruleParamTrasfert ) )
                    // InternalAsam.g:1046:5: (lv_fparam_11_0= ruleParamTrasfert )
                    {
                    // InternalAsam.g:1046:5: (lv_fparam_11_0= ruleParamTrasfert )
                    // InternalAsam.g:1047:6: lv_fparam_11_0= ruleParamTrasfert
                    {

                    						newCompositeNode(grammarAccess.getControllerAccess().getFparamParamTrasfertEnumRuleCall_7_2_0());
                    					
                    pushFollow(FOLLOW_35);
                    lv_fparam_11_0=ruleParamTrasfert();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getControllerRule());
                    						}
                    						set(
                    							current,
                    							"fparam",
                    							lv_fparam_11_0,
                    							"org.xtext.example.asam.Asam.ParamTrasfert");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalAsam.g:1065:3: (otherlv_12= 'delete' otherlv_13= 'entity:' ( (lv_dparam_14_0= ruleParamTrasfert ) ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==39) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalAsam.g:1066:4: otherlv_12= 'delete' otherlv_13= 'entity:' ( (lv_dparam_14_0= ruleParamTrasfert ) )
                    {
                    otherlv_12=(Token)match(input,39,FOLLOW_32); 

                    				newLeafNode(otherlv_12, grammarAccess.getControllerAccess().getDeleteKeyword_8_0());
                    			
                    otherlv_13=(Token)match(input,37,FOLLOW_33); 

                    				newLeafNode(otherlv_13, grammarAccess.getControllerAccess().getEntityKeyword_8_1());
                    			
                    // InternalAsam.g:1074:4: ( (lv_dparam_14_0= ruleParamTrasfert ) )
                    // InternalAsam.g:1075:5: (lv_dparam_14_0= ruleParamTrasfert )
                    {
                    // InternalAsam.g:1075:5: (lv_dparam_14_0= ruleParamTrasfert )
                    // InternalAsam.g:1076:6: lv_dparam_14_0= ruleParamTrasfert
                    {

                    						newCompositeNode(grammarAccess.getControllerAccess().getDparamParamTrasfertEnumRuleCall_8_2_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_dparam_14_0=ruleParamTrasfert();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getControllerRule());
                    						}
                    						set(
                    							current,
                    							"dparam",
                    							lv_dparam_14_0,
                    							"org.xtext.example.asam.Asam.ParamTrasfert");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_15=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_15, grammarAccess.getControllerAccess().getRightCurlyBracketKeyword_9());
            		

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


    // $ANTLR start "entryRuleServiceAction"
    // InternalAsam.g:1102:1: entryRuleServiceAction returns [EObject current=null] : iv_ruleServiceAction= ruleServiceAction EOF ;
    public final EObject entryRuleServiceAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleServiceAction = null;


        try {
            // InternalAsam.g:1102:54: (iv_ruleServiceAction= ruleServiceAction EOF )
            // InternalAsam.g:1103:2: iv_ruleServiceAction= ruleServiceAction EOF
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
    // InternalAsam.g:1109:1: ruleServiceAction returns [EObject current=null] : (otherlv_0= 'operation' ( (lv_nom_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'returns' ( (lv_returnType_4_0= ruleRType ) ) (otherlv_5= 'raises' ( (lv_exceptionType_6_0= ruleType ) ) )? (otherlv_7= 'implementation' ( (lv_implementation_8_0= RULE_STRING ) ) )? otherlv_9= 'params' otherlv_10= '(' ( (lv_parameters_11_0= ruleActionParameter ) )* otherlv_12= ')' otherlv_13= '}' ) ;
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
            // InternalAsam.g:1115:2: ( (otherlv_0= 'operation' ( (lv_nom_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'returns' ( (lv_returnType_4_0= ruleRType ) ) (otherlv_5= 'raises' ( (lv_exceptionType_6_0= ruleType ) ) )? (otherlv_7= 'implementation' ( (lv_implementation_8_0= RULE_STRING ) ) )? otherlv_9= 'params' otherlv_10= '(' ( (lv_parameters_11_0= ruleActionParameter ) )* otherlv_12= ')' otherlv_13= '}' ) )
            // InternalAsam.g:1116:2: (otherlv_0= 'operation' ( (lv_nom_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'returns' ( (lv_returnType_4_0= ruleRType ) ) (otherlv_5= 'raises' ( (lv_exceptionType_6_0= ruleType ) ) )? (otherlv_7= 'implementation' ( (lv_implementation_8_0= RULE_STRING ) ) )? otherlv_9= 'params' otherlv_10= '(' ( (lv_parameters_11_0= ruleActionParameter ) )* otherlv_12= ')' otherlv_13= '}' )
            {
            // InternalAsam.g:1116:2: (otherlv_0= 'operation' ( (lv_nom_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'returns' ( (lv_returnType_4_0= ruleRType ) ) (otherlv_5= 'raises' ( (lv_exceptionType_6_0= ruleType ) ) )? (otherlv_7= 'implementation' ( (lv_implementation_8_0= RULE_STRING ) ) )? otherlv_9= 'params' otherlv_10= '(' ( (lv_parameters_11_0= ruleActionParameter ) )* otherlv_12= ')' otherlv_13= '}' )
            // InternalAsam.g:1117:3: otherlv_0= 'operation' ( (lv_nom_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'returns' ( (lv_returnType_4_0= ruleRType ) ) (otherlv_5= 'raises' ( (lv_exceptionType_6_0= ruleType ) ) )? (otherlv_7= 'implementation' ( (lv_implementation_8_0= RULE_STRING ) ) )? otherlv_9= 'params' otherlv_10= '(' ( (lv_parameters_11_0= ruleActionParameter ) )* otherlv_12= ')' otherlv_13= '}'
            {
            otherlv_0=(Token)match(input,40,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getServiceActionAccess().getOperationKeyword_0());
            		
            // InternalAsam.g:1121:3: ( (lv_nom_1_0= RULE_ID ) )
            // InternalAsam.g:1122:4: (lv_nom_1_0= RULE_ID )
            {
            // InternalAsam.g:1122:4: (lv_nom_1_0= RULE_ID )
            // InternalAsam.g:1123:5: lv_nom_1_0= RULE_ID
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

            otherlv_2=(Token)match(input,17,FOLLOW_36); 

            			newLeafNode(otherlv_2, grammarAccess.getServiceActionAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,41,FOLLOW_37); 

            			newLeafNode(otherlv_3, grammarAccess.getServiceActionAccess().getReturnsKeyword_3());
            		
            // InternalAsam.g:1147:3: ( (lv_returnType_4_0= ruleRType ) )
            // InternalAsam.g:1148:4: (lv_returnType_4_0= ruleRType )
            {
            // InternalAsam.g:1148:4: (lv_returnType_4_0= ruleRType )
            // InternalAsam.g:1149:5: lv_returnType_4_0= ruleRType
            {

            					newCompositeNode(grammarAccess.getServiceActionAccess().getReturnTypeRTypeParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_38);
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

            // InternalAsam.g:1166:3: (otherlv_5= 'raises' ( (lv_exceptionType_6_0= ruleType ) ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==42) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalAsam.g:1167:4: otherlv_5= 'raises' ( (lv_exceptionType_6_0= ruleType ) )
                    {
                    otherlv_5=(Token)match(input,42,FOLLOW_39); 

                    				newLeafNode(otherlv_5, grammarAccess.getServiceActionAccess().getRaisesKeyword_5_0());
                    			
                    // InternalAsam.g:1171:4: ( (lv_exceptionType_6_0= ruleType ) )
                    // InternalAsam.g:1172:5: (lv_exceptionType_6_0= ruleType )
                    {
                    // InternalAsam.g:1172:5: (lv_exceptionType_6_0= ruleType )
                    // InternalAsam.g:1173:6: lv_exceptionType_6_0= ruleType
                    {

                    						newCompositeNode(grammarAccess.getServiceActionAccess().getExceptionTypeTypeParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_40);
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

            // InternalAsam.g:1191:3: (otherlv_7= 'implementation' ( (lv_implementation_8_0= RULE_STRING ) ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==43) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalAsam.g:1192:4: otherlv_7= 'implementation' ( (lv_implementation_8_0= RULE_STRING ) )
                    {
                    otherlv_7=(Token)match(input,43,FOLLOW_41); 

                    				newLeafNode(otherlv_7, grammarAccess.getServiceActionAccess().getImplementationKeyword_6_0());
                    			
                    // InternalAsam.g:1196:4: ( (lv_implementation_8_0= RULE_STRING ) )
                    // InternalAsam.g:1197:5: (lv_implementation_8_0= RULE_STRING )
                    {
                    // InternalAsam.g:1197:5: (lv_implementation_8_0= RULE_STRING )
                    // InternalAsam.g:1198:6: lv_implementation_8_0= RULE_STRING
                    {
                    lv_implementation_8_0=(Token)match(input,RULE_STRING,FOLLOW_42); 

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

            otherlv_9=(Token)match(input,44,FOLLOW_43); 

            			newLeafNode(otherlv_9, grammarAccess.getServiceActionAccess().getParamsKeyword_7());
            		
            otherlv_10=(Token)match(input,45,FOLLOW_44); 

            			newLeafNode(otherlv_10, grammarAccess.getServiceActionAccess().getLeftParenthesisKeyword_8());
            		
            // InternalAsam.g:1223:3: ( (lv_parameters_11_0= ruleActionParameter ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==RULE_ID) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalAsam.g:1224:4: (lv_parameters_11_0= ruleActionParameter )
            	    {
            	    // InternalAsam.g:1224:4: (lv_parameters_11_0= ruleActionParameter )
            	    // InternalAsam.g:1225:5: lv_parameters_11_0= ruleActionParameter
            	    {

            	    					newCompositeNode(grammarAccess.getServiceActionAccess().getParametersActionParameterParserRuleCall_9_0());
            	    				
            	    pushFollow(FOLLOW_44);
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

            otherlv_12=(Token)match(input,46,FOLLOW_11); 

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


    // $ANTLR start "entryRuleCustomAction"
    // InternalAsam.g:1254:1: entryRuleCustomAction returns [EObject current=null] : iv_ruleCustomAction= ruleCustomAction EOF ;
    public final EObject entryRuleCustomAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCustomAction = null;


        try {
            // InternalAsam.g:1254:53: (iv_ruleCustomAction= ruleCustomAction EOF )
            // InternalAsam.g:1255:2: iv_ruleCustomAction= ruleCustomAction EOF
            {
             newCompositeNode(grammarAccess.getCustomActionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCustomAction=ruleCustomAction();

            state._fsp--;

             current =iv_ruleCustomAction; 
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
    // $ANTLR end "entryRuleCustomAction"


    // $ANTLR start "ruleCustomAction"
    // InternalAsam.g:1261:1: ruleCustomAction returns [EObject current=null] : ( ( (lv_method_0_0= ruleHttpMethods ) ) otherlv_1= 'action' ( (lv_nom_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'mappedAt' ( (lv_url_5_0= RULE_STRING ) ) )? ( (lv_parameters_6_0= ruleActionParameter ) )* otherlv_7= '}' ) ;
    public final EObject ruleCustomAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_nom_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_url_5_0=null;
        Token otherlv_7=null;
        Enumerator lv_method_0_0 = null;

        EObject lv_parameters_6_0 = null;



        	enterRule();

        try {
            // InternalAsam.g:1267:2: ( ( ( (lv_method_0_0= ruleHttpMethods ) ) otherlv_1= 'action' ( (lv_nom_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'mappedAt' ( (lv_url_5_0= RULE_STRING ) ) )? ( (lv_parameters_6_0= ruleActionParameter ) )* otherlv_7= '}' ) )
            // InternalAsam.g:1268:2: ( ( (lv_method_0_0= ruleHttpMethods ) ) otherlv_1= 'action' ( (lv_nom_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'mappedAt' ( (lv_url_5_0= RULE_STRING ) ) )? ( (lv_parameters_6_0= ruleActionParameter ) )* otherlv_7= '}' )
            {
            // InternalAsam.g:1268:2: ( ( (lv_method_0_0= ruleHttpMethods ) ) otherlv_1= 'action' ( (lv_nom_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'mappedAt' ( (lv_url_5_0= RULE_STRING ) ) )? ( (lv_parameters_6_0= ruleActionParameter ) )* otherlv_7= '}' )
            // InternalAsam.g:1269:3: ( (lv_method_0_0= ruleHttpMethods ) ) otherlv_1= 'action' ( (lv_nom_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'mappedAt' ( (lv_url_5_0= RULE_STRING ) ) )? ( (lv_parameters_6_0= ruleActionParameter ) )* otherlv_7= '}'
            {
            // InternalAsam.g:1269:3: ( (lv_method_0_0= ruleHttpMethods ) )
            // InternalAsam.g:1270:4: (lv_method_0_0= ruleHttpMethods )
            {
            // InternalAsam.g:1270:4: (lv_method_0_0= ruleHttpMethods )
            // InternalAsam.g:1271:5: lv_method_0_0= ruleHttpMethods
            {

            					newCompositeNode(grammarAccess.getCustomActionAccess().getMethodHttpMethodsEnumRuleCall_0_0());
            				
            pushFollow(FOLLOW_45);
            lv_method_0_0=ruleHttpMethods();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCustomActionRule());
            					}
            					set(
            						current,
            						"method",
            						lv_method_0_0,
            						"org.xtext.example.asam.Asam.HttpMethods");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,47,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getCustomActionAccess().getActionKeyword_1());
            		
            // InternalAsam.g:1292:3: ( (lv_nom_2_0= RULE_ID ) )
            // InternalAsam.g:1293:4: (lv_nom_2_0= RULE_ID )
            {
            // InternalAsam.g:1293:4: (lv_nom_2_0= RULE_ID )
            // InternalAsam.g:1294:5: lv_nom_2_0= RULE_ID
            {
            lv_nom_2_0=(Token)match(input,RULE_ID,FOLLOW_9); 

            					newLeafNode(lv_nom_2_0, grammarAccess.getCustomActionAccess().getNomIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCustomActionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"nom",
            						lv_nom_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,17,FOLLOW_46); 

            			newLeafNode(otherlv_3, grammarAccess.getCustomActionAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalAsam.g:1314:3: (otherlv_4= 'mappedAt' ( (lv_url_5_0= RULE_STRING ) ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==48) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalAsam.g:1315:4: otherlv_4= 'mappedAt' ( (lv_url_5_0= RULE_STRING ) )
                    {
                    otherlv_4=(Token)match(input,48,FOLLOW_41); 

                    				newLeafNode(otherlv_4, grammarAccess.getCustomActionAccess().getMappedAtKeyword_4_0());
                    			
                    // InternalAsam.g:1319:4: ( (lv_url_5_0= RULE_STRING ) )
                    // InternalAsam.g:1320:5: (lv_url_5_0= RULE_STRING )
                    {
                    // InternalAsam.g:1320:5: (lv_url_5_0= RULE_STRING )
                    // InternalAsam.g:1321:6: lv_url_5_0= RULE_STRING
                    {
                    lv_url_5_0=(Token)match(input,RULE_STRING,FOLLOW_26); 

                    						newLeafNode(lv_url_5_0, grammarAccess.getCustomActionAccess().getUrlSTRINGTerminalRuleCall_4_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getCustomActionRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"url",
                    							lv_url_5_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalAsam.g:1338:3: ( (lv_parameters_6_0= ruleActionParameter ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==RULE_ID) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalAsam.g:1339:4: (lv_parameters_6_0= ruleActionParameter )
            	    {
            	    // InternalAsam.g:1339:4: (lv_parameters_6_0= ruleActionParameter )
            	    // InternalAsam.g:1340:5: lv_parameters_6_0= ruleActionParameter
            	    {

            	    					newCompositeNode(grammarAccess.getCustomActionAccess().getParametersActionParameterParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_26);
            	    lv_parameters_6_0=ruleActionParameter();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getCustomActionRule());
            	    					}
            	    					add(
            	    						current,
            	    						"parameters",
            	    						lv_parameters_6_0,
            	    						"org.xtext.example.asam.Asam.ActionParameter");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

            otherlv_7=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getCustomActionAccess().getRightCurlyBracketKeyword_6());
            		

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
    // $ANTLR end "ruleCustomAction"


    // $ANTLR start "entryRuleActionParameter"
    // InternalAsam.g:1365:1: entryRuleActionParameter returns [EObject current=null] : iv_ruleActionParameter= ruleActionParameter EOF ;
    public final EObject entryRuleActionParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActionParameter = null;


        try {
            // InternalAsam.g:1365:56: (iv_ruleActionParameter= ruleActionParameter EOF )
            // InternalAsam.g:1366:2: iv_ruleActionParameter= ruleActionParameter EOF
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
    // InternalAsam.g:1372:1: ruleActionParameter returns [EObject current=null] : ( ( (lv_nom_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleType ) ) (otherlv_3= 'default' ( (lv_defaultValue_4_0= RULE_STRING ) ) )? ) ;
    public final EObject ruleActionParameter() throws RecognitionException {
        EObject current = null;

        Token lv_nom_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token lv_defaultValue_4_0=null;
        EObject lv_type_2_0 = null;



        	enterRule();

        try {
            // InternalAsam.g:1378:2: ( ( ( (lv_nom_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleType ) ) (otherlv_3= 'default' ( (lv_defaultValue_4_0= RULE_STRING ) ) )? ) )
            // InternalAsam.g:1379:2: ( ( (lv_nom_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleType ) ) (otherlv_3= 'default' ( (lv_defaultValue_4_0= RULE_STRING ) ) )? )
            {
            // InternalAsam.g:1379:2: ( ( (lv_nom_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleType ) ) (otherlv_3= 'default' ( (lv_defaultValue_4_0= RULE_STRING ) ) )? )
            // InternalAsam.g:1380:3: ( (lv_nom_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleType ) ) (otherlv_3= 'default' ( (lv_defaultValue_4_0= RULE_STRING ) ) )?
            {
            // InternalAsam.g:1380:3: ( (lv_nom_0_0= RULE_ID ) )
            // InternalAsam.g:1381:4: (lv_nom_0_0= RULE_ID )
            {
            // InternalAsam.g:1381:4: (lv_nom_0_0= RULE_ID )
            // InternalAsam.g:1382:5: lv_nom_0_0= RULE_ID
            {
            lv_nom_0_0=(Token)match(input,RULE_ID,FOLLOW_47); 

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

            otherlv_1=(Token)match(input,49,FOLLOW_39); 

            			newLeafNode(otherlv_1, grammarAccess.getActionParameterAccess().getColonKeyword_1());
            		
            // InternalAsam.g:1402:3: ( (lv_type_2_0= ruleType ) )
            // InternalAsam.g:1403:4: (lv_type_2_0= ruleType )
            {
            // InternalAsam.g:1403:4: (lv_type_2_0= ruleType )
            // InternalAsam.g:1404:5: lv_type_2_0= ruleType
            {

            					newCompositeNode(grammarAccess.getActionParameterAccess().getTypeTypeParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_48);
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

            // InternalAsam.g:1421:3: (otherlv_3= 'default' ( (lv_defaultValue_4_0= RULE_STRING ) ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==50) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalAsam.g:1422:4: otherlv_3= 'default' ( (lv_defaultValue_4_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,50,FOLLOW_41); 

                    				newLeafNode(otherlv_3, grammarAccess.getActionParameterAccess().getDefaultKeyword_3_0());
                    			
                    // InternalAsam.g:1426:4: ( (lv_defaultValue_4_0= RULE_STRING ) )
                    // InternalAsam.g:1427:5: (lv_defaultValue_4_0= RULE_STRING )
                    {
                    // InternalAsam.g:1427:5: (lv_defaultValue_4_0= RULE_STRING )
                    // InternalAsam.g:1428:6: lv_defaultValue_4_0= RULE_STRING
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


    // $ANTLR start "entryRuleRepository"
    // InternalAsam.g:1449:1: entryRuleRepository returns [EObject current=null] : iv_ruleRepository= ruleRepository EOF ;
    public final EObject entryRuleRepository() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRepository = null;


        try {
            // InternalAsam.g:1449:51: (iv_ruleRepository= ruleRepository EOF )
            // InternalAsam.g:1450:2: iv_ruleRepository= ruleRepository EOF
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
    // InternalAsam.g:1456:1: ruleRepository returns [EObject current=null] : (otherlv_0= 'repository' otherlv_1= '{' ( (lv_findBy_2_0= ruleFindByMethod ) )* ( (lv_deleteBy_3_0= ruleDeleteByMethod ) )* ( (lv_customQueryMethod_4_0= ruleCustomQueryMethod ) )* otherlv_5= '}' ) ;
    public final EObject ruleRepository() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_5=null;
        EObject lv_findBy_2_0 = null;

        EObject lv_deleteBy_3_0 = null;

        EObject lv_customQueryMethod_4_0 = null;



        	enterRule();

        try {
            // InternalAsam.g:1462:2: ( (otherlv_0= 'repository' otherlv_1= '{' ( (lv_findBy_2_0= ruleFindByMethod ) )* ( (lv_deleteBy_3_0= ruleDeleteByMethod ) )* ( (lv_customQueryMethod_4_0= ruleCustomQueryMethod ) )* otherlv_5= '}' ) )
            // InternalAsam.g:1463:2: (otherlv_0= 'repository' otherlv_1= '{' ( (lv_findBy_2_0= ruleFindByMethod ) )* ( (lv_deleteBy_3_0= ruleDeleteByMethod ) )* ( (lv_customQueryMethod_4_0= ruleCustomQueryMethod ) )* otherlv_5= '}' )
            {
            // InternalAsam.g:1463:2: (otherlv_0= 'repository' otherlv_1= '{' ( (lv_findBy_2_0= ruleFindByMethod ) )* ( (lv_deleteBy_3_0= ruleDeleteByMethod ) )* ( (lv_customQueryMethod_4_0= ruleCustomQueryMethod ) )* otherlv_5= '}' )
            // InternalAsam.g:1464:3: otherlv_0= 'repository' otherlv_1= '{' ( (lv_findBy_2_0= ruleFindByMethod ) )* ( (lv_deleteBy_3_0= ruleDeleteByMethod ) )* ( (lv_customQueryMethod_4_0= ruleCustomQueryMethod ) )* otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,51,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getRepositoryAccess().getRepositoryKeyword_0());
            		
            otherlv_1=(Token)match(input,17,FOLLOW_49); 

            			newLeafNode(otherlv_1, grammarAccess.getRepositoryAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalAsam.g:1472:3: ( (lv_findBy_2_0= ruleFindByMethod ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==38) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalAsam.g:1473:4: (lv_findBy_2_0= ruleFindByMethod )
            	    {
            	    // InternalAsam.g:1473:4: (lv_findBy_2_0= ruleFindByMethod )
            	    // InternalAsam.g:1474:5: lv_findBy_2_0= ruleFindByMethod
            	    {

            	    					newCompositeNode(grammarAccess.getRepositoryAccess().getFindByFindByMethodParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_49);
            	    lv_findBy_2_0=ruleFindByMethod();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getRepositoryRule());
            	    					}
            	    					add(
            	    						current,
            	    						"findBy",
            	    						lv_findBy_2_0,
            	    						"org.xtext.example.asam.Asam.FindByMethod");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

            // InternalAsam.g:1491:3: ( (lv_deleteBy_3_0= ruleDeleteByMethod ) )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==39) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalAsam.g:1492:4: (lv_deleteBy_3_0= ruleDeleteByMethod )
            	    {
            	    // InternalAsam.g:1492:4: (lv_deleteBy_3_0= ruleDeleteByMethod )
            	    // InternalAsam.g:1493:5: lv_deleteBy_3_0= ruleDeleteByMethod
            	    {

            	    					newCompositeNode(grammarAccess.getRepositoryAccess().getDeleteByDeleteByMethodParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_50);
            	    lv_deleteBy_3_0=ruleDeleteByMethod();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getRepositoryRule());
            	    					}
            	    					add(
            	    						current,
            	    						"deleteBy",
            	    						lv_deleteBy_3_0,
            	    						"org.xtext.example.asam.Asam.DeleteByMethod");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

            // InternalAsam.g:1510:3: ( (lv_customQueryMethod_4_0= ruleCustomQueryMethod ) )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==53) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalAsam.g:1511:4: (lv_customQueryMethod_4_0= ruleCustomQueryMethod )
            	    {
            	    // InternalAsam.g:1511:4: (lv_customQueryMethod_4_0= ruleCustomQueryMethod )
            	    // InternalAsam.g:1512:5: lv_customQueryMethod_4_0= ruleCustomQueryMethod
            	    {

            	    					newCompositeNode(grammarAccess.getRepositoryAccess().getCustomQueryMethodCustomQueryMethodParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_51);
            	    lv_customQueryMethod_4_0=ruleCustomQueryMethod();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getRepositoryRule());
            	    					}
            	    					add(
            	    						current,
            	    						"customQueryMethod",
            	    						lv_customQueryMethod_4_0,
            	    						"org.xtext.example.asam.Asam.CustomQueryMethod");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

            otherlv_5=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getRepositoryAccess().getRightCurlyBracketKeyword_5());
            		

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


    // $ANTLR start "entryRuleFindByMethod"
    // InternalAsam.g:1537:1: entryRuleFindByMethod returns [EObject current=null] : iv_ruleFindByMethod= ruleFindByMethod EOF ;
    public final EObject entryRuleFindByMethod() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFindByMethod = null;


        try {
            // InternalAsam.g:1537:53: (iv_ruleFindByMethod= ruleFindByMethod EOF )
            // InternalAsam.g:1538:2: iv_ruleFindByMethod= ruleFindByMethod EOF
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
    // InternalAsam.g:1544:1: ruleFindByMethod returns [EObject current=null] : (otherlv_0= 'find' otherlv_1= 'by' ( (lv_property_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_ptype_4_0= ruleVTypes ) ) ) ;
    public final EObject ruleFindByMethod() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_property_2_0=null;
        Token otherlv_3=null;
        Enumerator lv_ptype_4_0 = null;



        	enterRule();

        try {
            // InternalAsam.g:1550:2: ( (otherlv_0= 'find' otherlv_1= 'by' ( (lv_property_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_ptype_4_0= ruleVTypes ) ) ) )
            // InternalAsam.g:1551:2: (otherlv_0= 'find' otherlv_1= 'by' ( (lv_property_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_ptype_4_0= ruleVTypes ) ) )
            {
            // InternalAsam.g:1551:2: (otherlv_0= 'find' otherlv_1= 'by' ( (lv_property_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_ptype_4_0= ruleVTypes ) ) )
            // InternalAsam.g:1552:3: otherlv_0= 'find' otherlv_1= 'by' ( (lv_property_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_ptype_4_0= ruleVTypes ) )
            {
            otherlv_0=(Token)match(input,38,FOLLOW_52); 

            			newLeafNode(otherlv_0, grammarAccess.getFindByMethodAccess().getFindKeyword_0());
            		
            otherlv_1=(Token)match(input,52,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getFindByMethodAccess().getByKeyword_1());
            		
            // InternalAsam.g:1560:3: ( (lv_property_2_0= RULE_ID ) )
            // InternalAsam.g:1561:4: (lv_property_2_0= RULE_ID )
            {
            // InternalAsam.g:1561:4: (lv_property_2_0= RULE_ID )
            // InternalAsam.g:1562:5: lv_property_2_0= RULE_ID
            {
            lv_property_2_0=(Token)match(input,RULE_ID,FOLLOW_47); 

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

            otherlv_3=(Token)match(input,49,FOLLOW_25); 

            			newLeafNode(otherlv_3, grammarAccess.getFindByMethodAccess().getColonKeyword_3());
            		
            // InternalAsam.g:1582:3: ( (lv_ptype_4_0= ruleVTypes ) )
            // InternalAsam.g:1583:4: (lv_ptype_4_0= ruleVTypes )
            {
            // InternalAsam.g:1583:4: (lv_ptype_4_0= ruleVTypes )
            // InternalAsam.g:1584:5: lv_ptype_4_0= ruleVTypes
            {

            					newCompositeNode(grammarAccess.getFindByMethodAccess().getPtypeVTypesEnumRuleCall_4_0());
            				
            pushFollow(FOLLOW_2);
            lv_ptype_4_0=ruleVTypes();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFindByMethodRule());
            					}
            					set(
            						current,
            						"ptype",
            						lv_ptype_4_0,
            						"org.xtext.example.asam.Asam.VTypes");
            					afterParserOrEnumRuleCall();
            				

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
    // InternalAsam.g:1605:1: entryRuleDeleteByMethod returns [EObject current=null] : iv_ruleDeleteByMethod= ruleDeleteByMethod EOF ;
    public final EObject entryRuleDeleteByMethod() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeleteByMethod = null;


        try {
            // InternalAsam.g:1605:55: (iv_ruleDeleteByMethod= ruleDeleteByMethod EOF )
            // InternalAsam.g:1606:2: iv_ruleDeleteByMethod= ruleDeleteByMethod EOF
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
    // InternalAsam.g:1612:1: ruleDeleteByMethod returns [EObject current=null] : (otherlv_0= 'delete' otherlv_1= 'by' ( (lv_property_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_ptype_4_0= ruleVTypes ) ) ) ;
    public final EObject ruleDeleteByMethod() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_property_2_0=null;
        Token otherlv_3=null;
        Enumerator lv_ptype_4_0 = null;



        	enterRule();

        try {
            // InternalAsam.g:1618:2: ( (otherlv_0= 'delete' otherlv_1= 'by' ( (lv_property_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_ptype_4_0= ruleVTypes ) ) ) )
            // InternalAsam.g:1619:2: (otherlv_0= 'delete' otherlv_1= 'by' ( (lv_property_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_ptype_4_0= ruleVTypes ) ) )
            {
            // InternalAsam.g:1619:2: (otherlv_0= 'delete' otherlv_1= 'by' ( (lv_property_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_ptype_4_0= ruleVTypes ) ) )
            // InternalAsam.g:1620:3: otherlv_0= 'delete' otherlv_1= 'by' ( (lv_property_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_ptype_4_0= ruleVTypes ) )
            {
            otherlv_0=(Token)match(input,39,FOLLOW_52); 

            			newLeafNode(otherlv_0, grammarAccess.getDeleteByMethodAccess().getDeleteKeyword_0());
            		
            otherlv_1=(Token)match(input,52,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getDeleteByMethodAccess().getByKeyword_1());
            		
            // InternalAsam.g:1628:3: ( (lv_property_2_0= RULE_ID ) )
            // InternalAsam.g:1629:4: (lv_property_2_0= RULE_ID )
            {
            // InternalAsam.g:1629:4: (lv_property_2_0= RULE_ID )
            // InternalAsam.g:1630:5: lv_property_2_0= RULE_ID
            {
            lv_property_2_0=(Token)match(input,RULE_ID,FOLLOW_47); 

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

            otherlv_3=(Token)match(input,49,FOLLOW_25); 

            			newLeafNode(otherlv_3, grammarAccess.getDeleteByMethodAccess().getColonKeyword_3());
            		
            // InternalAsam.g:1650:3: ( (lv_ptype_4_0= ruleVTypes ) )
            // InternalAsam.g:1651:4: (lv_ptype_4_0= ruleVTypes )
            {
            // InternalAsam.g:1651:4: (lv_ptype_4_0= ruleVTypes )
            // InternalAsam.g:1652:5: lv_ptype_4_0= ruleVTypes
            {

            					newCompositeNode(grammarAccess.getDeleteByMethodAccess().getPtypeVTypesEnumRuleCall_4_0());
            				
            pushFollow(FOLLOW_2);
            lv_ptype_4_0=ruleVTypes();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDeleteByMethodRule());
            					}
            					set(
            						current,
            						"ptype",
            						lv_ptype_4_0,
            						"org.xtext.example.asam.Asam.VTypes");
            					afterParserOrEnumRuleCall();
            				

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
    // InternalAsam.g:1673:1: entryRuleCustomQueryMethod returns [EObject current=null] : iv_ruleCustomQueryMethod= ruleCustomQueryMethod EOF ;
    public final EObject entryRuleCustomQueryMethod() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCustomQueryMethod = null;


        try {
            // InternalAsam.g:1673:58: (iv_ruleCustomQueryMethod= ruleCustomQueryMethod EOF )
            // InternalAsam.g:1674:2: iv_ruleCustomQueryMethod= ruleCustomQueryMethod EOF
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
    // InternalAsam.g:1680:1: ruleCustomQueryMethod returns [EObject current=null] : (otherlv_0= 'customQuery' otherlv_1= '{' ( (lv_query_2_0= RULE_STRING ) ) otherlv_3= '}' ) ;
    public final EObject ruleCustomQueryMethod() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_query_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalAsam.g:1686:2: ( (otherlv_0= 'customQuery' otherlv_1= '{' ( (lv_query_2_0= RULE_STRING ) ) otherlv_3= '}' ) )
            // InternalAsam.g:1687:2: (otherlv_0= 'customQuery' otherlv_1= '{' ( (lv_query_2_0= RULE_STRING ) ) otherlv_3= '}' )
            {
            // InternalAsam.g:1687:2: (otherlv_0= 'customQuery' otherlv_1= '{' ( (lv_query_2_0= RULE_STRING ) ) otherlv_3= '}' )
            // InternalAsam.g:1688:3: otherlv_0= 'customQuery' otherlv_1= '{' ( (lv_query_2_0= RULE_STRING ) ) otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,53,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getCustomQueryMethodAccess().getCustomQueryKeyword_0());
            		
            otherlv_1=(Token)match(input,17,FOLLOW_41); 

            			newLeafNode(otherlv_1, grammarAccess.getCustomQueryMethodAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalAsam.g:1696:3: ( (lv_query_2_0= RULE_STRING ) )
            // InternalAsam.g:1697:4: (lv_query_2_0= RULE_STRING )
            {
            // InternalAsam.g:1697:4: (lv_query_2_0= RULE_STRING )
            // InternalAsam.g:1698:5: lv_query_2_0= RULE_STRING
            {
            lv_query_2_0=(Token)match(input,RULE_STRING,FOLLOW_11); 

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


    // $ANTLR start "entryRuleProperty"
    // InternalAsam.g:1722:1: entryRuleProperty returns [EObject current=null] : iv_ruleProperty= ruleProperty EOF ;
    public final EObject entryRuleProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProperty = null;


        try {
            // InternalAsam.g:1722:49: (iv_ruleProperty= ruleProperty EOF )
            // InternalAsam.g:1723:2: iv_ruleProperty= ruleProperty EOF
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
    // InternalAsam.g:1729:1: ruleProperty returns [EObject current=null] : ( ( (lv_nom_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleType ) ) (otherlv_3= 'default' ( (lv_defaultValue_4_0= RULE_STRING ) ) )? ) ;
    public final EObject ruleProperty() throws RecognitionException {
        EObject current = null;

        Token lv_nom_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token lv_defaultValue_4_0=null;
        EObject lv_type_2_0 = null;



        	enterRule();

        try {
            // InternalAsam.g:1735:2: ( ( ( (lv_nom_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleType ) ) (otherlv_3= 'default' ( (lv_defaultValue_4_0= RULE_STRING ) ) )? ) )
            // InternalAsam.g:1736:2: ( ( (lv_nom_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleType ) ) (otherlv_3= 'default' ( (lv_defaultValue_4_0= RULE_STRING ) ) )? )
            {
            // InternalAsam.g:1736:2: ( ( (lv_nom_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleType ) ) (otherlv_3= 'default' ( (lv_defaultValue_4_0= RULE_STRING ) ) )? )
            // InternalAsam.g:1737:3: ( (lv_nom_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleType ) ) (otherlv_3= 'default' ( (lv_defaultValue_4_0= RULE_STRING ) ) )?
            {
            // InternalAsam.g:1737:3: ( (lv_nom_0_0= RULE_ID ) )
            // InternalAsam.g:1738:4: (lv_nom_0_0= RULE_ID )
            {
            // InternalAsam.g:1738:4: (lv_nom_0_0= RULE_ID )
            // InternalAsam.g:1739:5: lv_nom_0_0= RULE_ID
            {
            lv_nom_0_0=(Token)match(input,RULE_ID,FOLLOW_47); 

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

            otherlv_1=(Token)match(input,49,FOLLOW_39); 

            			newLeafNode(otherlv_1, grammarAccess.getPropertyAccess().getColonKeyword_1());
            		
            // InternalAsam.g:1759:3: ( (lv_type_2_0= ruleType ) )
            // InternalAsam.g:1760:4: (lv_type_2_0= ruleType )
            {
            // InternalAsam.g:1760:4: (lv_type_2_0= ruleType )
            // InternalAsam.g:1761:5: lv_type_2_0= ruleType
            {

            					newCompositeNode(grammarAccess.getPropertyAccess().getTypeTypeParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_48);
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

            // InternalAsam.g:1778:3: (otherlv_3= 'default' ( (lv_defaultValue_4_0= RULE_STRING ) ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==50) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalAsam.g:1779:4: otherlv_3= 'default' ( (lv_defaultValue_4_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,50,FOLLOW_41); 

                    				newLeafNode(otherlv_3, grammarAccess.getPropertyAccess().getDefaultKeyword_3_0());
                    			
                    // InternalAsam.g:1783:4: ( (lv_defaultValue_4_0= RULE_STRING ) )
                    // InternalAsam.g:1784:5: (lv_defaultValue_4_0= RULE_STRING )
                    {
                    // InternalAsam.g:1784:5: (lv_defaultValue_4_0= RULE_STRING )
                    // InternalAsam.g:1785:6: lv_defaultValue_4_0= RULE_STRING
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
    // InternalAsam.g:1806:1: entryRuleType returns [EObject current=null] : iv_ruleType= ruleType EOF ;
    public final EObject entryRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType = null;


        try {
            // InternalAsam.g:1806:45: (iv_ruleType= ruleType EOF )
            // InternalAsam.g:1807:2: iv_ruleType= ruleType EOF
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
    // InternalAsam.g:1813:1: ruleType returns [EObject current=null] : ( ( (lv_Vtypes_0_0= ruleVTypes ) ) | this_ListType_1= ruleListType | this_SetType_2= ruleSetType ) ;
    public final EObject ruleType() throws RecognitionException {
        EObject current = null;

        Enumerator lv_Vtypes_0_0 = null;

        EObject this_ListType_1 = null;

        EObject this_SetType_2 = null;



        	enterRule();

        try {
            // InternalAsam.g:1819:2: ( ( ( (lv_Vtypes_0_0= ruleVTypes ) ) | this_ListType_1= ruleListType | this_SetType_2= ruleSetType ) )
            // InternalAsam.g:1820:2: ( ( (lv_Vtypes_0_0= ruleVTypes ) ) | this_ListType_1= ruleListType | this_SetType_2= ruleSetType )
            {
            // InternalAsam.g:1820:2: ( ( (lv_Vtypes_0_0= ruleVTypes ) ) | this_ListType_1= ruleListType | this_SetType_2= ruleSetType )
            int alt26=3;
            switch ( input.LA(1) ) {
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
                {
                alt26=1;
                }
                break;
            case 54:
                {
                alt26=2;
                }
                break;
            case 56:
                {
                alt26=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }

            switch (alt26) {
                case 1 :
                    // InternalAsam.g:1821:3: ( (lv_Vtypes_0_0= ruleVTypes ) )
                    {
                    // InternalAsam.g:1821:3: ( (lv_Vtypes_0_0= ruleVTypes ) )
                    // InternalAsam.g:1822:4: (lv_Vtypes_0_0= ruleVTypes )
                    {
                    // InternalAsam.g:1822:4: (lv_Vtypes_0_0= ruleVTypes )
                    // InternalAsam.g:1823:5: lv_Vtypes_0_0= ruleVTypes
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
                    // InternalAsam.g:1841:3: this_ListType_1= ruleListType
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
                    // InternalAsam.g:1850:3: this_SetType_2= ruleSetType
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
    // InternalAsam.g:1862:1: entryRuleRType returns [EObject current=null] : iv_ruleRType= ruleRType EOF ;
    public final EObject entryRuleRType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRType = null;


        try {
            // InternalAsam.g:1862:46: (iv_ruleRType= ruleRType EOF )
            // InternalAsam.g:1863:2: iv_ruleRType= ruleRType EOF
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
    // InternalAsam.g:1869:1: ruleRType returns [EObject current=null] : ( ( (lv_Vypes_0_0= ruleVTypes ) ) | this_ListType_1= ruleListType | this_ID_2= RULE_ID ) ;
    public final EObject ruleRType() throws RecognitionException {
        EObject current = null;

        Token this_ID_2=null;
        Enumerator lv_Vypes_0_0 = null;

        EObject this_ListType_1 = null;



        	enterRule();

        try {
            // InternalAsam.g:1875:2: ( ( ( (lv_Vypes_0_0= ruleVTypes ) ) | this_ListType_1= ruleListType | this_ID_2= RULE_ID ) )
            // InternalAsam.g:1876:2: ( ( (lv_Vypes_0_0= ruleVTypes ) ) | this_ListType_1= ruleListType | this_ID_2= RULE_ID )
            {
            // InternalAsam.g:1876:2: ( ( (lv_Vypes_0_0= ruleVTypes ) ) | this_ListType_1= ruleListType | this_ID_2= RULE_ID )
            int alt27=3;
            switch ( input.LA(1) ) {
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
                {
                alt27=1;
                }
                break;
            case 54:
                {
                alt27=2;
                }
                break;
            case RULE_ID:
                {
                alt27=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }

            switch (alt27) {
                case 1 :
                    // InternalAsam.g:1877:3: ( (lv_Vypes_0_0= ruleVTypes ) )
                    {
                    // InternalAsam.g:1877:3: ( (lv_Vypes_0_0= ruleVTypes ) )
                    // InternalAsam.g:1878:4: (lv_Vypes_0_0= ruleVTypes )
                    {
                    // InternalAsam.g:1878:4: (lv_Vypes_0_0= ruleVTypes )
                    // InternalAsam.g:1879:5: lv_Vypes_0_0= ruleVTypes
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
                    // InternalAsam.g:1897:3: this_ListType_1= ruleListType
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
                    // InternalAsam.g:1906:3: this_ID_2= RULE_ID
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
    // InternalAsam.g:1914:1: entryRuleListType returns [EObject current=null] : iv_ruleListType= ruleListType EOF ;
    public final EObject entryRuleListType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleListType = null;


        try {
            // InternalAsam.g:1914:49: (iv_ruleListType= ruleListType EOF )
            // InternalAsam.g:1915:2: iv_ruleListType= ruleListType EOF
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
    // InternalAsam.g:1921:1: ruleListType returns [EObject current=null] : (otherlv_0= 'List<' ( (lv_type_1_0= ruleType ) ) otherlv_2= '>' ) ;
    public final EObject ruleListType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_type_1_0 = null;



        	enterRule();

        try {
            // InternalAsam.g:1927:2: ( (otherlv_0= 'List<' ( (lv_type_1_0= ruleType ) ) otherlv_2= '>' ) )
            // InternalAsam.g:1928:2: (otherlv_0= 'List<' ( (lv_type_1_0= ruleType ) ) otherlv_2= '>' )
            {
            // InternalAsam.g:1928:2: (otherlv_0= 'List<' ( (lv_type_1_0= ruleType ) ) otherlv_2= '>' )
            // InternalAsam.g:1929:3: otherlv_0= 'List<' ( (lv_type_1_0= ruleType ) ) otherlv_2= '>'
            {
            otherlv_0=(Token)match(input,54,FOLLOW_39); 

            			newLeafNode(otherlv_0, grammarAccess.getListTypeAccess().getListKeyword_0());
            		
            // InternalAsam.g:1933:3: ( (lv_type_1_0= ruleType ) )
            // InternalAsam.g:1934:4: (lv_type_1_0= ruleType )
            {
            // InternalAsam.g:1934:4: (lv_type_1_0= ruleType )
            // InternalAsam.g:1935:5: lv_type_1_0= ruleType
            {

            					newCompositeNode(grammarAccess.getListTypeAccess().getTypeTypeParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_53);
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
    // InternalAsam.g:1960:1: entryRuleSetType returns [EObject current=null] : iv_ruleSetType= ruleSetType EOF ;
    public final EObject entryRuleSetType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSetType = null;


        try {
            // InternalAsam.g:1960:48: (iv_ruleSetType= ruleSetType EOF )
            // InternalAsam.g:1961:2: iv_ruleSetType= ruleSetType EOF
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
    // InternalAsam.g:1967:1: ruleSetType returns [EObject current=null] : (otherlv_0= 'Set<' ( (lv_type_1_0= ruleType ) ) otherlv_2= '>' ) ;
    public final EObject ruleSetType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_type_1_0 = null;



        	enterRule();

        try {
            // InternalAsam.g:1973:2: ( (otherlv_0= 'Set<' ( (lv_type_1_0= ruleType ) ) otherlv_2= '>' ) )
            // InternalAsam.g:1974:2: (otherlv_0= 'Set<' ( (lv_type_1_0= ruleType ) ) otherlv_2= '>' )
            {
            // InternalAsam.g:1974:2: (otherlv_0= 'Set<' ( (lv_type_1_0= ruleType ) ) otherlv_2= '>' )
            // InternalAsam.g:1975:3: otherlv_0= 'Set<' ( (lv_type_1_0= ruleType ) ) otherlv_2= '>'
            {
            otherlv_0=(Token)match(input,56,FOLLOW_39); 

            			newLeafNode(otherlv_0, grammarAccess.getSetTypeAccess().getSetKeyword_0());
            		
            // InternalAsam.g:1979:3: ( (lv_type_1_0= ruleType ) )
            // InternalAsam.g:1980:4: (lv_type_1_0= ruleType )
            {
            // InternalAsam.g:1980:4: (lv_type_1_0= ruleType )
            // InternalAsam.g:1981:5: lv_type_1_0= ruleType
            {

            					newCompositeNode(grammarAccess.getSetTypeAccess().getTypeTypeParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_53);
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
    // InternalAsam.g:2006:1: ruleVTypes returns [Enumerator current=null] : ( (enumLiteral_0= 'float' ) | (enumLiteral_1= 'long' ) | (enumLiteral_2= 'int' ) | (enumLiteral_3= 'char' ) | (enumLiteral_4= 'boolean' ) | (enumLiteral_5= 'byte' ) | (enumLiteral_6= 'String' ) ) ;
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
            // InternalAsam.g:2012:2: ( ( (enumLiteral_0= 'float' ) | (enumLiteral_1= 'long' ) | (enumLiteral_2= 'int' ) | (enumLiteral_3= 'char' ) | (enumLiteral_4= 'boolean' ) | (enumLiteral_5= 'byte' ) | (enumLiteral_6= 'String' ) ) )
            // InternalAsam.g:2013:2: ( (enumLiteral_0= 'float' ) | (enumLiteral_1= 'long' ) | (enumLiteral_2= 'int' ) | (enumLiteral_3= 'char' ) | (enumLiteral_4= 'boolean' ) | (enumLiteral_5= 'byte' ) | (enumLiteral_6= 'String' ) )
            {
            // InternalAsam.g:2013:2: ( (enumLiteral_0= 'float' ) | (enumLiteral_1= 'long' ) | (enumLiteral_2= 'int' ) | (enumLiteral_3= 'char' ) | (enumLiteral_4= 'boolean' ) | (enumLiteral_5= 'byte' ) | (enumLiteral_6= 'String' ) )
            int alt28=7;
            switch ( input.LA(1) ) {
            case 57:
                {
                alt28=1;
                }
                break;
            case 58:
                {
                alt28=2;
                }
                break;
            case 59:
                {
                alt28=3;
                }
                break;
            case 60:
                {
                alt28=4;
                }
                break;
            case 61:
                {
                alt28=5;
                }
                break;
            case 62:
                {
                alt28=6;
                }
                break;
            case 63:
                {
                alt28=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }

            switch (alt28) {
                case 1 :
                    // InternalAsam.g:2014:3: (enumLiteral_0= 'float' )
                    {
                    // InternalAsam.g:2014:3: (enumLiteral_0= 'float' )
                    // InternalAsam.g:2015:4: enumLiteral_0= 'float'
                    {
                    enumLiteral_0=(Token)match(input,57,FOLLOW_2); 

                    				current = grammarAccess.getVTypesAccess().getFLOATEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getVTypesAccess().getFLOATEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalAsam.g:2022:3: (enumLiteral_1= 'long' )
                    {
                    // InternalAsam.g:2022:3: (enumLiteral_1= 'long' )
                    // InternalAsam.g:2023:4: enumLiteral_1= 'long'
                    {
                    enumLiteral_1=(Token)match(input,58,FOLLOW_2); 

                    				current = grammarAccess.getVTypesAccess().getLONGEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getVTypesAccess().getLONGEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalAsam.g:2030:3: (enumLiteral_2= 'int' )
                    {
                    // InternalAsam.g:2030:3: (enumLiteral_2= 'int' )
                    // InternalAsam.g:2031:4: enumLiteral_2= 'int'
                    {
                    enumLiteral_2=(Token)match(input,59,FOLLOW_2); 

                    				current = grammarAccess.getVTypesAccess().getINTEGEREnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getVTypesAccess().getINTEGEREnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalAsam.g:2038:3: (enumLiteral_3= 'char' )
                    {
                    // InternalAsam.g:2038:3: (enumLiteral_3= 'char' )
                    // InternalAsam.g:2039:4: enumLiteral_3= 'char'
                    {
                    enumLiteral_3=(Token)match(input,60,FOLLOW_2); 

                    				current = grammarAccess.getVTypesAccess().getCHAREnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getVTypesAccess().getCHAREnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalAsam.g:2046:3: (enumLiteral_4= 'boolean' )
                    {
                    // InternalAsam.g:2046:3: (enumLiteral_4= 'boolean' )
                    // InternalAsam.g:2047:4: enumLiteral_4= 'boolean'
                    {
                    enumLiteral_4=(Token)match(input,61,FOLLOW_2); 

                    				current = grammarAccess.getVTypesAccess().getBOOLEANEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getVTypesAccess().getBOOLEANEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalAsam.g:2054:3: (enumLiteral_5= 'byte' )
                    {
                    // InternalAsam.g:2054:3: (enumLiteral_5= 'byte' )
                    // InternalAsam.g:2055:4: enumLiteral_5= 'byte'
                    {
                    enumLiteral_5=(Token)match(input,62,FOLLOW_2); 

                    				current = grammarAccess.getVTypesAccess().getBYTEEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getVTypesAccess().getBYTEEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalAsam.g:2062:3: (enumLiteral_6= 'String' )
                    {
                    // InternalAsam.g:2062:3: (enumLiteral_6= 'String' )
                    // InternalAsam.g:2063:4: enumLiteral_6= 'String'
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
    // InternalAsam.g:2073:1: ruleHttpMethods returns [Enumerator current=null] : ( (enumLiteral_0= 'Get' ) | (enumLiteral_1= 'Delete' ) | (enumLiteral_2= 'Post' ) | (enumLiteral_3= 'Put' ) | (enumLiteral_4= 'Patch' ) ) ;
    public final Enumerator ruleHttpMethods() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;


        	enterRule();

        try {
            // InternalAsam.g:2079:2: ( ( (enumLiteral_0= 'Get' ) | (enumLiteral_1= 'Delete' ) | (enumLiteral_2= 'Post' ) | (enumLiteral_3= 'Put' ) | (enumLiteral_4= 'Patch' ) ) )
            // InternalAsam.g:2080:2: ( (enumLiteral_0= 'Get' ) | (enumLiteral_1= 'Delete' ) | (enumLiteral_2= 'Post' ) | (enumLiteral_3= 'Put' ) | (enumLiteral_4= 'Patch' ) )
            {
            // InternalAsam.g:2080:2: ( (enumLiteral_0= 'Get' ) | (enumLiteral_1= 'Delete' ) | (enumLiteral_2= 'Post' ) | (enumLiteral_3= 'Put' ) | (enumLiteral_4= 'Patch' ) )
            int alt29=5;
            switch ( input.LA(1) ) {
            case 64:
                {
                alt29=1;
                }
                break;
            case 65:
                {
                alt29=2;
                }
                break;
            case 66:
                {
                alt29=3;
                }
                break;
            case 67:
                {
                alt29=4;
                }
                break;
            case 68:
                {
                alt29=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }

            switch (alt29) {
                case 1 :
                    // InternalAsam.g:2081:3: (enumLiteral_0= 'Get' )
                    {
                    // InternalAsam.g:2081:3: (enumLiteral_0= 'Get' )
                    // InternalAsam.g:2082:4: enumLiteral_0= 'Get'
                    {
                    enumLiteral_0=(Token)match(input,64,FOLLOW_2); 

                    				current = grammarAccess.getHttpMethodsAccess().getGETEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getHttpMethodsAccess().getGETEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalAsam.g:2089:3: (enumLiteral_1= 'Delete' )
                    {
                    // InternalAsam.g:2089:3: (enumLiteral_1= 'Delete' )
                    // InternalAsam.g:2090:4: enumLiteral_1= 'Delete'
                    {
                    enumLiteral_1=(Token)match(input,65,FOLLOW_2); 

                    				current = grammarAccess.getHttpMethodsAccess().getDELETEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getHttpMethodsAccess().getDELETEEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalAsam.g:2097:3: (enumLiteral_2= 'Post' )
                    {
                    // InternalAsam.g:2097:3: (enumLiteral_2= 'Post' )
                    // InternalAsam.g:2098:4: enumLiteral_2= 'Post'
                    {
                    enumLiteral_2=(Token)match(input,66,FOLLOW_2); 

                    				current = grammarAccess.getHttpMethodsAccess().getPOSTEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getHttpMethodsAccess().getPOSTEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalAsam.g:2105:3: (enumLiteral_3= 'Put' )
                    {
                    // InternalAsam.g:2105:3: (enumLiteral_3= 'Put' )
                    // InternalAsam.g:2106:4: enumLiteral_3= 'Put'
                    {
                    enumLiteral_3=(Token)match(input,67,FOLLOW_2); 

                    				current = grammarAccess.getHttpMethodsAccess().getPUTEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getHttpMethodsAccess().getPUTEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalAsam.g:2113:3: (enumLiteral_4= 'Patch' )
                    {
                    // InternalAsam.g:2113:3: (enumLiteral_4= 'Patch' )
                    // InternalAsam.g:2114:4: enumLiteral_4= 'Patch'
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
    // InternalAsam.g:2124:1: ruleRDBMS returns [Enumerator current=null] : ( (enumLiteral_0= 'Mysql' ) | (enumLiteral_1= 'Postgres' ) | (enumLiteral_2= 'Mariadb' ) | (enumLiteral_3= 'h2' ) | (enumLiteral_4= 'Oracle' ) ) ;
    public final Enumerator ruleRDBMS() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;


        	enterRule();

        try {
            // InternalAsam.g:2130:2: ( ( (enumLiteral_0= 'Mysql' ) | (enumLiteral_1= 'Postgres' ) | (enumLiteral_2= 'Mariadb' ) | (enumLiteral_3= 'h2' ) | (enumLiteral_4= 'Oracle' ) ) )
            // InternalAsam.g:2131:2: ( (enumLiteral_0= 'Mysql' ) | (enumLiteral_1= 'Postgres' ) | (enumLiteral_2= 'Mariadb' ) | (enumLiteral_3= 'h2' ) | (enumLiteral_4= 'Oracle' ) )
            {
            // InternalAsam.g:2131:2: ( (enumLiteral_0= 'Mysql' ) | (enumLiteral_1= 'Postgres' ) | (enumLiteral_2= 'Mariadb' ) | (enumLiteral_3= 'h2' ) | (enumLiteral_4= 'Oracle' ) )
            int alt30=5;
            switch ( input.LA(1) ) {
            case 69:
                {
                alt30=1;
                }
                break;
            case 70:
                {
                alt30=2;
                }
                break;
            case 71:
                {
                alt30=3;
                }
                break;
            case 72:
                {
                alt30=4;
                }
                break;
            case 73:
                {
                alt30=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }

            switch (alt30) {
                case 1 :
                    // InternalAsam.g:2132:3: (enumLiteral_0= 'Mysql' )
                    {
                    // InternalAsam.g:2132:3: (enumLiteral_0= 'Mysql' )
                    // InternalAsam.g:2133:4: enumLiteral_0= 'Mysql'
                    {
                    enumLiteral_0=(Token)match(input,69,FOLLOW_2); 

                    				current = grammarAccess.getRDBMSAccess().getMYSQLEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getRDBMSAccess().getMYSQLEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalAsam.g:2140:3: (enumLiteral_1= 'Postgres' )
                    {
                    // InternalAsam.g:2140:3: (enumLiteral_1= 'Postgres' )
                    // InternalAsam.g:2141:4: enumLiteral_1= 'Postgres'
                    {
                    enumLiteral_1=(Token)match(input,70,FOLLOW_2); 

                    				current = grammarAccess.getRDBMSAccess().getPOSTGRESEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getRDBMSAccess().getPOSTGRESEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalAsam.g:2148:3: (enumLiteral_2= 'Mariadb' )
                    {
                    // InternalAsam.g:2148:3: (enumLiteral_2= 'Mariadb' )
                    // InternalAsam.g:2149:4: enumLiteral_2= 'Mariadb'
                    {
                    enumLiteral_2=(Token)match(input,71,FOLLOW_2); 

                    				current = grammarAccess.getRDBMSAccess().getMARIADBEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getRDBMSAccess().getMARIADBEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalAsam.g:2156:3: (enumLiteral_3= 'h2' )
                    {
                    // InternalAsam.g:2156:3: (enumLiteral_3= 'h2' )
                    // InternalAsam.g:2157:4: enumLiteral_3= 'h2'
                    {
                    enumLiteral_3=(Token)match(input,72,FOLLOW_2); 

                    				current = grammarAccess.getRDBMSAccess().getH2EnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getRDBMSAccess().getH2EnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalAsam.g:2164:3: (enumLiteral_4= 'Oracle' )
                    {
                    // InternalAsam.g:2164:3: (enumLiteral_4= 'Oracle' )
                    // InternalAsam.g:2165:4: enumLiteral_4= 'Oracle'
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
    // InternalAsam.g:2175:1: ruledbRelations returns [Enumerator current=null] : ( (enumLiteral_0= 'ManyToMany' ) | (enumLiteral_1= 'ManyToOne' ) | (enumLiteral_2= 'OneToMany' ) ) ;
    public final Enumerator ruledbRelations() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalAsam.g:2181:2: ( ( (enumLiteral_0= 'ManyToMany' ) | (enumLiteral_1= 'ManyToOne' ) | (enumLiteral_2= 'OneToMany' ) ) )
            // InternalAsam.g:2182:2: ( (enumLiteral_0= 'ManyToMany' ) | (enumLiteral_1= 'ManyToOne' ) | (enumLiteral_2= 'OneToMany' ) )
            {
            // InternalAsam.g:2182:2: ( (enumLiteral_0= 'ManyToMany' ) | (enumLiteral_1= 'ManyToOne' ) | (enumLiteral_2= 'OneToMany' ) )
            int alt31=3;
            switch ( input.LA(1) ) {
            case 74:
                {
                alt31=1;
                }
                break;
            case 75:
                {
                alt31=2;
                }
                break;
            case 76:
                {
                alt31=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }

            switch (alt31) {
                case 1 :
                    // InternalAsam.g:2183:3: (enumLiteral_0= 'ManyToMany' )
                    {
                    // InternalAsam.g:2183:3: (enumLiteral_0= 'ManyToMany' )
                    // InternalAsam.g:2184:4: enumLiteral_0= 'ManyToMany'
                    {
                    enumLiteral_0=(Token)match(input,74,FOLLOW_2); 

                    				current = grammarAccess.getDbRelationsAccess().getM2MEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getDbRelationsAccess().getM2MEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalAsam.g:2191:3: (enumLiteral_1= 'ManyToOne' )
                    {
                    // InternalAsam.g:2191:3: (enumLiteral_1= 'ManyToOne' )
                    // InternalAsam.g:2192:4: enumLiteral_1= 'ManyToOne'
                    {
                    enumLiteral_1=(Token)match(input,75,FOLLOW_2); 

                    				current = grammarAccess.getDbRelationsAccess().getM2OEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getDbRelationsAccess().getM2OEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalAsam.g:2199:3: (enumLiteral_2= 'OneToMany' )
                    {
                    // InternalAsam.g:2199:3: (enumLiteral_2= 'OneToMany' )
                    // InternalAsam.g:2200:4: enumLiteral_2= 'OneToMany'
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


    // $ANTLR start "ruleParamTrasfert"
    // InternalAsam.g:2210:1: ruleParamTrasfert returns [Enumerator current=null] : ( (enumLiteral_0= 'RequestBody' ) | (enumLiteral_1= 'RequestParam' ) | (enumLiteral_2= 'PathVariable' ) ) ;
    public final Enumerator ruleParamTrasfert() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalAsam.g:2216:2: ( ( (enumLiteral_0= 'RequestBody' ) | (enumLiteral_1= 'RequestParam' ) | (enumLiteral_2= 'PathVariable' ) ) )
            // InternalAsam.g:2217:2: ( (enumLiteral_0= 'RequestBody' ) | (enumLiteral_1= 'RequestParam' ) | (enumLiteral_2= 'PathVariable' ) )
            {
            // InternalAsam.g:2217:2: ( (enumLiteral_0= 'RequestBody' ) | (enumLiteral_1= 'RequestParam' ) | (enumLiteral_2= 'PathVariable' ) )
            int alt32=3;
            switch ( input.LA(1) ) {
            case 77:
                {
                alt32=1;
                }
                break;
            case 78:
                {
                alt32=2;
                }
                break;
            case 79:
                {
                alt32=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }

            switch (alt32) {
                case 1 :
                    // InternalAsam.g:2218:3: (enumLiteral_0= 'RequestBody' )
                    {
                    // InternalAsam.g:2218:3: (enumLiteral_0= 'RequestBody' )
                    // InternalAsam.g:2219:4: enumLiteral_0= 'RequestBody'
                    {
                    enumLiteral_0=(Token)match(input,77,FOLLOW_2); 

                    				current = grammarAccess.getParamTrasfertAccess().getRequestBodyEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getParamTrasfertAccess().getRequestBodyEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalAsam.g:2226:3: (enumLiteral_1= 'RequestParam' )
                    {
                    // InternalAsam.g:2226:3: (enumLiteral_1= 'RequestParam' )
                    // InternalAsam.g:2227:4: enumLiteral_1= 'RequestParam'
                    {
                    enumLiteral_1=(Token)match(input,78,FOLLOW_2); 

                    				current = grammarAccess.getParamTrasfertAccess().getRequestParamEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getParamTrasfertAccess().getRequestParamEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalAsam.g:2234:3: (enumLiteral_2= 'PathVariable' )
                    {
                    // InternalAsam.g:2234:3: (enumLiteral_2= 'PathVariable' )
                    // InternalAsam.g:2235:4: enumLiteral_2= 'PathVariable'
                    {
                    enumLiteral_2=(Token)match(input,79,FOLLOW_2); 

                    				current = grammarAccess.getParamTrasfertAccess().getPathVariableEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getParamTrasfertAccess().getPathVariableEnumLiteralDeclaration_2());
                    			

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
    // $ANTLR end "ruleParamTrasfert"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0008000190012002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0008000190002002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001C00L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000480000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000240000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000000L,0x00000000000003E0L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000020020000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0008000400000010L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0xFE00000000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000040010L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000010000040000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x000000D000040040L,0x000000000000001FL});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x000000D000040000L,0x000000000000001FL});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000000000000L,0x000000000000E000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x000000C000040000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000008000040000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0xFE40000000000010L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x00001C0000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0xFF40000000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000180000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000400000000010L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0001000000040010L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0004000000000002L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x002000C000040000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0020008000040000L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0020000000040000L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0080000000000000L});

}