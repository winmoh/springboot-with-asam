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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_PATH", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'project'", "'config'", "'{'", "'}'", "'server'", "'port'", "'cpath'", "'database'", "'dbms'", "'dname'", "'dport'", "'username'", "'password'", "'entity'", "'inherits'", "'dto'", "'service'", "'pertainingTo'", "'controller'", "'mappingTo'", "'repository'", "'for'", "'find'", "'by'", "'And'", "'delete'", "'customQuery'", "'operation'", "'returns'", "'raises'", "'implementation'", "'params'", "'('", "')'", "'action'", "'linkedTo'", "'mappedAt'", "':'", "'default'", "'List<'", "'>'", "'Set<'", "'float'", "'long'", "'int'", "'char'", "'boolean'", "'byte'", "'String'", "'Get'", "'Delete'", "'Post'", "'Put'", "'Patch'", "'Mysql'", "'Postgres'", "'Mariadb'", "'h2'", "'Oracle'"
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
    public static final int RULE_STRING=7;
    public static final int RULE_SL_COMMENT=9;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
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

            if ( (LA1_0==13) ) {
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

                if ( (LA2_0==25||(LA2_0>=27 && LA2_0<=28)||LA2_0==30||LA2_0==32) ) {
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
    // InternalAsam.g:151:1: ruleElement returns [EObject current=null] : (this_Entity_0= ruleEntity | this_Service_1= ruleService | this_Controller_2= ruleController | this_DTO_3= ruleDTO | this_Repository_4= ruleRepository ) ;
    public final EObject ruleElement() throws RecognitionException {
        EObject current = null;

        EObject this_Entity_0 = null;

        EObject this_Service_1 = null;

        EObject this_Controller_2 = null;

        EObject this_DTO_3 = null;

        EObject this_Repository_4 = null;



        	enterRule();

        try {
            // InternalAsam.g:157:2: ( (this_Entity_0= ruleEntity | this_Service_1= ruleService | this_Controller_2= ruleController | this_DTO_3= ruleDTO | this_Repository_4= ruleRepository ) )
            // InternalAsam.g:158:2: (this_Entity_0= ruleEntity | this_Service_1= ruleService | this_Controller_2= ruleController | this_DTO_3= ruleDTO | this_Repository_4= ruleRepository )
            {
            // InternalAsam.g:158:2: (this_Entity_0= ruleEntity | this_Service_1= ruleService | this_Controller_2= ruleController | this_DTO_3= ruleDTO | this_Repository_4= ruleRepository )
            int alt3=5;
            switch ( input.LA(1) ) {
            case 25:
                {
                alt3=1;
                }
                break;
            case 28:
                {
                alt3=2;
                }
                break;
            case 30:
                {
                alt3=3;
                }
                break;
            case 27:
                {
                alt3=4;
                }
                break;
            case 32:
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


    // $ANTLR start "entryRuleConfiguration"
    // InternalAsam.g:207:1: entryRuleConfiguration returns [EObject current=null] : iv_ruleConfiguration= ruleConfiguration EOF ;
    public final EObject entryRuleConfiguration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConfiguration = null;


        try {
            // InternalAsam.g:207:54: (iv_ruleConfiguration= ruleConfiguration EOF )
            // InternalAsam.g:208:2: iv_ruleConfiguration= ruleConfiguration EOF
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
    // InternalAsam.g:214:1: ruleConfiguration returns [EObject current=null] : (otherlv_0= 'config' otherlv_1= '{' ( (lv_server_2_0= ruleServerInfo ) )? ( (lv_database_3_0= ruleDatabaseInfo ) )? otherlv_4= '}' ) ;
    public final EObject ruleConfiguration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_4=null;
        EObject lv_server_2_0 = null;

        EObject lv_database_3_0 = null;



        	enterRule();

        try {
            // InternalAsam.g:220:2: ( (otherlv_0= 'config' otherlv_1= '{' ( (lv_server_2_0= ruleServerInfo ) )? ( (lv_database_3_0= ruleDatabaseInfo ) )? otherlv_4= '}' ) )
            // InternalAsam.g:221:2: (otherlv_0= 'config' otherlv_1= '{' ( (lv_server_2_0= ruleServerInfo ) )? ( (lv_database_3_0= ruleDatabaseInfo ) )? otherlv_4= '}' )
            {
            // InternalAsam.g:221:2: (otherlv_0= 'config' otherlv_1= '{' ( (lv_server_2_0= ruleServerInfo ) )? ( (lv_database_3_0= ruleDatabaseInfo ) )? otherlv_4= '}' )
            // InternalAsam.g:222:3: otherlv_0= 'config' otherlv_1= '{' ( (lv_server_2_0= ruleServerInfo ) )? ( (lv_database_3_0= ruleDatabaseInfo ) )? otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,13,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getConfigurationAccess().getConfigKeyword_0());
            		
            otherlv_1=(Token)match(input,14,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getConfigurationAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalAsam.g:230:3: ( (lv_server_2_0= ruleServerInfo ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==16) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalAsam.g:231:4: (lv_server_2_0= ruleServerInfo )
                    {
                    // InternalAsam.g:231:4: (lv_server_2_0= ruleServerInfo )
                    // InternalAsam.g:232:5: lv_server_2_0= ruleServerInfo
                    {

                    					newCompositeNode(grammarAccess.getConfigurationAccess().getServerServerInfoParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_8);
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

            // InternalAsam.g:249:3: ( (lv_database_3_0= ruleDatabaseInfo ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==19) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalAsam.g:250:4: (lv_database_3_0= ruleDatabaseInfo )
                    {
                    // InternalAsam.g:250:4: (lv_database_3_0= ruleDatabaseInfo )
                    // InternalAsam.g:251:5: lv_database_3_0= ruleDatabaseInfo
                    {

                    					newCompositeNode(grammarAccess.getConfigurationAccess().getDatabaseDatabaseInfoParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_9);
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

            otherlv_4=(Token)match(input,15,FOLLOW_2); 

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
    // InternalAsam.g:276:1: entryRuleServerInfo returns [EObject current=null] : iv_ruleServerInfo= ruleServerInfo EOF ;
    public final EObject entryRuleServerInfo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleServerInfo = null;


        try {
            // InternalAsam.g:276:51: (iv_ruleServerInfo= ruleServerInfo EOF )
            // InternalAsam.g:277:2: iv_ruleServerInfo= ruleServerInfo EOF
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
    // InternalAsam.g:283:1: ruleServerInfo returns [EObject current=null] : (otherlv_0= 'server' otherlv_1= '{' (otherlv_2= 'port' ( (lv_port_3_0= RULE_INT ) ) )? (otherlv_4= 'cpath' ( (lv_path_5_0= RULE_PATH ) ) )? otherlv_6= '}' ) ;
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
            // InternalAsam.g:289:2: ( (otherlv_0= 'server' otherlv_1= '{' (otherlv_2= 'port' ( (lv_port_3_0= RULE_INT ) ) )? (otherlv_4= 'cpath' ( (lv_path_5_0= RULE_PATH ) ) )? otherlv_6= '}' ) )
            // InternalAsam.g:290:2: (otherlv_0= 'server' otherlv_1= '{' (otherlv_2= 'port' ( (lv_port_3_0= RULE_INT ) ) )? (otherlv_4= 'cpath' ( (lv_path_5_0= RULE_PATH ) ) )? otherlv_6= '}' )
            {
            // InternalAsam.g:290:2: (otherlv_0= 'server' otherlv_1= '{' (otherlv_2= 'port' ( (lv_port_3_0= RULE_INT ) ) )? (otherlv_4= 'cpath' ( (lv_path_5_0= RULE_PATH ) ) )? otherlv_6= '}' )
            // InternalAsam.g:291:3: otherlv_0= 'server' otherlv_1= '{' (otherlv_2= 'port' ( (lv_port_3_0= RULE_INT ) ) )? (otherlv_4= 'cpath' ( (lv_path_5_0= RULE_PATH ) ) )? otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,16,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getServerInfoAccess().getServerKeyword_0());
            		
            otherlv_1=(Token)match(input,14,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getServerInfoAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalAsam.g:299:3: (otherlv_2= 'port' ( (lv_port_3_0= RULE_INT ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==17) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalAsam.g:300:4: otherlv_2= 'port' ( (lv_port_3_0= RULE_INT ) )
                    {
                    otherlv_2=(Token)match(input,17,FOLLOW_11); 

                    				newLeafNode(otherlv_2, grammarAccess.getServerInfoAccess().getPortKeyword_2_0());
                    			
                    // InternalAsam.g:304:4: ( (lv_port_3_0= RULE_INT ) )
                    // InternalAsam.g:305:5: (lv_port_3_0= RULE_INT )
                    {
                    // InternalAsam.g:305:5: (lv_port_3_0= RULE_INT )
                    // InternalAsam.g:306:6: lv_port_3_0= RULE_INT
                    {
                    lv_port_3_0=(Token)match(input,RULE_INT,FOLLOW_12); 

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

            // InternalAsam.g:323:3: (otherlv_4= 'cpath' ( (lv_path_5_0= RULE_PATH ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==18) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalAsam.g:324:4: otherlv_4= 'cpath' ( (lv_path_5_0= RULE_PATH ) )
                    {
                    otherlv_4=(Token)match(input,18,FOLLOW_13); 

                    				newLeafNode(otherlv_4, grammarAccess.getServerInfoAccess().getCpathKeyword_3_0());
                    			
                    // InternalAsam.g:328:4: ( (lv_path_5_0= RULE_PATH ) )
                    // InternalAsam.g:329:5: (lv_path_5_0= RULE_PATH )
                    {
                    // InternalAsam.g:329:5: (lv_path_5_0= RULE_PATH )
                    // InternalAsam.g:330:6: lv_path_5_0= RULE_PATH
                    {
                    lv_path_5_0=(Token)match(input,RULE_PATH,FOLLOW_9); 

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

            otherlv_6=(Token)match(input,15,FOLLOW_2); 

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
    // InternalAsam.g:355:1: entryRuleDatabaseInfo returns [EObject current=null] : iv_ruleDatabaseInfo= ruleDatabaseInfo EOF ;
    public final EObject entryRuleDatabaseInfo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDatabaseInfo = null;


        try {
            // InternalAsam.g:355:53: (iv_ruleDatabaseInfo= ruleDatabaseInfo EOF )
            // InternalAsam.g:356:2: iv_ruleDatabaseInfo= ruleDatabaseInfo EOF
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
    // InternalAsam.g:362:1: ruleDatabaseInfo returns [EObject current=null] : (otherlv_0= 'database' otherlv_1= '{' otherlv_2= 'dbms' ( (lv_type_3_0= ruleRDBMS ) ) otherlv_4= 'dname' ( (lv_nom_5_0= RULE_ID ) ) otherlv_6= 'dport' ( (lv_port_7_0= RULE_INT ) ) otherlv_8= 'username' ( (lv_username_9_0= RULE_ID ) ) otherlv_10= 'password' ( (lv_password_11_0= RULE_ID ) ) otherlv_12= '}' ) ;
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
            // InternalAsam.g:368:2: ( (otherlv_0= 'database' otherlv_1= '{' otherlv_2= 'dbms' ( (lv_type_3_0= ruleRDBMS ) ) otherlv_4= 'dname' ( (lv_nom_5_0= RULE_ID ) ) otherlv_6= 'dport' ( (lv_port_7_0= RULE_INT ) ) otherlv_8= 'username' ( (lv_username_9_0= RULE_ID ) ) otherlv_10= 'password' ( (lv_password_11_0= RULE_ID ) ) otherlv_12= '}' ) )
            // InternalAsam.g:369:2: (otherlv_0= 'database' otherlv_1= '{' otherlv_2= 'dbms' ( (lv_type_3_0= ruleRDBMS ) ) otherlv_4= 'dname' ( (lv_nom_5_0= RULE_ID ) ) otherlv_6= 'dport' ( (lv_port_7_0= RULE_INT ) ) otherlv_8= 'username' ( (lv_username_9_0= RULE_ID ) ) otherlv_10= 'password' ( (lv_password_11_0= RULE_ID ) ) otherlv_12= '}' )
            {
            // InternalAsam.g:369:2: (otherlv_0= 'database' otherlv_1= '{' otherlv_2= 'dbms' ( (lv_type_3_0= ruleRDBMS ) ) otherlv_4= 'dname' ( (lv_nom_5_0= RULE_ID ) ) otherlv_6= 'dport' ( (lv_port_7_0= RULE_INT ) ) otherlv_8= 'username' ( (lv_username_9_0= RULE_ID ) ) otherlv_10= 'password' ( (lv_password_11_0= RULE_ID ) ) otherlv_12= '}' )
            // InternalAsam.g:370:3: otherlv_0= 'database' otherlv_1= '{' otherlv_2= 'dbms' ( (lv_type_3_0= ruleRDBMS ) ) otherlv_4= 'dname' ( (lv_nom_5_0= RULE_ID ) ) otherlv_6= 'dport' ( (lv_port_7_0= RULE_INT ) ) otherlv_8= 'username' ( (lv_username_9_0= RULE_ID ) ) otherlv_10= 'password' ( (lv_password_11_0= RULE_ID ) ) otherlv_12= '}'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getDatabaseInfoAccess().getDatabaseKeyword_0());
            		
            otherlv_1=(Token)match(input,14,FOLLOW_14); 

            			newLeafNode(otherlv_1, grammarAccess.getDatabaseInfoAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,20,FOLLOW_15); 

            			newLeafNode(otherlv_2, grammarAccess.getDatabaseInfoAccess().getDbmsKeyword_2());
            		
            // InternalAsam.g:382:3: ( (lv_type_3_0= ruleRDBMS ) )
            // InternalAsam.g:383:4: (lv_type_3_0= ruleRDBMS )
            {
            // InternalAsam.g:383:4: (lv_type_3_0= ruleRDBMS )
            // InternalAsam.g:384:5: lv_type_3_0= ruleRDBMS
            {

            					newCompositeNode(grammarAccess.getDatabaseInfoAccess().getTypeRDBMSEnumRuleCall_3_0());
            				
            pushFollow(FOLLOW_16);
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

            otherlv_4=(Token)match(input,21,FOLLOW_3); 

            			newLeafNode(otherlv_4, grammarAccess.getDatabaseInfoAccess().getDnameKeyword_4());
            		
            // InternalAsam.g:405:3: ( (lv_nom_5_0= RULE_ID ) )
            // InternalAsam.g:406:4: (lv_nom_5_0= RULE_ID )
            {
            // InternalAsam.g:406:4: (lv_nom_5_0= RULE_ID )
            // InternalAsam.g:407:5: lv_nom_5_0= RULE_ID
            {
            lv_nom_5_0=(Token)match(input,RULE_ID,FOLLOW_17); 

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

            otherlv_6=(Token)match(input,22,FOLLOW_11); 

            			newLeafNode(otherlv_6, grammarAccess.getDatabaseInfoAccess().getDportKeyword_6());
            		
            // InternalAsam.g:427:3: ( (lv_port_7_0= RULE_INT ) )
            // InternalAsam.g:428:4: (lv_port_7_0= RULE_INT )
            {
            // InternalAsam.g:428:4: (lv_port_7_0= RULE_INT )
            // InternalAsam.g:429:5: lv_port_7_0= RULE_INT
            {
            lv_port_7_0=(Token)match(input,RULE_INT,FOLLOW_18); 

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

            otherlv_8=(Token)match(input,23,FOLLOW_3); 

            			newLeafNode(otherlv_8, grammarAccess.getDatabaseInfoAccess().getUsernameKeyword_8());
            		
            // InternalAsam.g:449:3: ( (lv_username_9_0= RULE_ID ) )
            // InternalAsam.g:450:4: (lv_username_9_0= RULE_ID )
            {
            // InternalAsam.g:450:4: (lv_username_9_0= RULE_ID )
            // InternalAsam.g:451:5: lv_username_9_0= RULE_ID
            {
            lv_username_9_0=(Token)match(input,RULE_ID,FOLLOW_19); 

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

            otherlv_10=(Token)match(input,24,FOLLOW_3); 

            			newLeafNode(otherlv_10, grammarAccess.getDatabaseInfoAccess().getPasswordKeyword_10());
            		
            // InternalAsam.g:471:3: ( (lv_password_11_0= RULE_ID ) )
            // InternalAsam.g:472:4: (lv_password_11_0= RULE_ID )
            {
            // InternalAsam.g:472:4: (lv_password_11_0= RULE_ID )
            // InternalAsam.g:473:5: lv_password_11_0= RULE_ID
            {
            lv_password_11_0=(Token)match(input,RULE_ID,FOLLOW_9); 

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

            otherlv_12=(Token)match(input,15,FOLLOW_2); 

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
    // InternalAsam.g:497:1: entryRuleEntity returns [EObject current=null] : iv_ruleEntity= ruleEntity EOF ;
    public final EObject entryRuleEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntity = null;


        try {
            // InternalAsam.g:497:47: (iv_ruleEntity= ruleEntity EOF )
            // InternalAsam.g:498:2: iv_ruleEntity= ruleEntity EOF
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
    // InternalAsam.g:504:1: ruleEntity returns [EObject current=null] : (otherlv_0= 'entity' ( (lv_nom_1_0= RULE_ID ) ) (otherlv_2= 'inherits' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_properties_5_0= ruleProperty ) )* otherlv_6= '}' ) ;
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
            // InternalAsam.g:510:2: ( (otherlv_0= 'entity' ( (lv_nom_1_0= RULE_ID ) ) (otherlv_2= 'inherits' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_properties_5_0= ruleProperty ) )* otherlv_6= '}' ) )
            // InternalAsam.g:511:2: (otherlv_0= 'entity' ( (lv_nom_1_0= RULE_ID ) ) (otherlv_2= 'inherits' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_properties_5_0= ruleProperty ) )* otherlv_6= '}' )
            {
            // InternalAsam.g:511:2: (otherlv_0= 'entity' ( (lv_nom_1_0= RULE_ID ) ) (otherlv_2= 'inherits' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_properties_5_0= ruleProperty ) )* otherlv_6= '}' )
            // InternalAsam.g:512:3: otherlv_0= 'entity' ( (lv_nom_1_0= RULE_ID ) ) (otherlv_2= 'inherits' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_properties_5_0= ruleProperty ) )* otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,25,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getEntityAccess().getEntityKeyword_0());
            		
            // InternalAsam.g:516:3: ( (lv_nom_1_0= RULE_ID ) )
            // InternalAsam.g:517:4: (lv_nom_1_0= RULE_ID )
            {
            // InternalAsam.g:517:4: (lv_nom_1_0= RULE_ID )
            // InternalAsam.g:518:5: lv_nom_1_0= RULE_ID
            {
            lv_nom_1_0=(Token)match(input,RULE_ID,FOLLOW_20); 

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

            // InternalAsam.g:534:3: (otherlv_2= 'inherits' ( (otherlv_3= RULE_ID ) ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==26) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalAsam.g:535:4: otherlv_2= 'inherits' ( (otherlv_3= RULE_ID ) )
                    {
                    otherlv_2=(Token)match(input,26,FOLLOW_3); 

                    				newLeafNode(otherlv_2, grammarAccess.getEntityAccess().getInheritsKeyword_2_0());
                    			
                    // InternalAsam.g:539:4: ( (otherlv_3= RULE_ID ) )
                    // InternalAsam.g:540:5: (otherlv_3= RULE_ID )
                    {
                    // InternalAsam.g:540:5: (otherlv_3= RULE_ID )
                    // InternalAsam.g:541:6: otherlv_3= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEntityRule());
                    						}
                    					
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_6); 

                    						newLeafNode(otherlv_3, grammarAccess.getEntityAccess().getExtendsEntityCrossReference_2_1_0());
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,14,FOLLOW_21); 

            			newLeafNode(otherlv_4, grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalAsam.g:557:3: ( (lv_properties_5_0= ruleProperty ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_ID) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalAsam.g:558:4: (lv_properties_5_0= ruleProperty )
            	    {
            	    // InternalAsam.g:558:4: (lv_properties_5_0= ruleProperty )
            	    // InternalAsam.g:559:5: lv_properties_5_0= ruleProperty
            	    {

            	    					newCompositeNode(grammarAccess.getEntityAccess().getPropertiesPropertyParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_21);
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

            otherlv_6=(Token)match(input,15,FOLLOW_2); 

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
    // InternalAsam.g:584:1: entryRuleDTO returns [EObject current=null] : iv_ruleDTO= ruleDTO EOF ;
    public final EObject entryRuleDTO() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDTO = null;


        try {
            // InternalAsam.g:584:44: (iv_ruleDTO= ruleDTO EOF )
            // InternalAsam.g:585:2: iv_ruleDTO= ruleDTO EOF
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
    // InternalAsam.g:591:1: ruleDTO returns [EObject current=null] : (otherlv_0= 'dto' ( (lv_nom_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_properties_3_0= ruleProperty ) )* otherlv_4= '}' ) ;
    public final EObject ruleDTO() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_nom_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_properties_3_0 = null;



        	enterRule();

        try {
            // InternalAsam.g:597:2: ( (otherlv_0= 'dto' ( (lv_nom_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_properties_3_0= ruleProperty ) )* otherlv_4= '}' ) )
            // InternalAsam.g:598:2: (otherlv_0= 'dto' ( (lv_nom_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_properties_3_0= ruleProperty ) )* otherlv_4= '}' )
            {
            // InternalAsam.g:598:2: (otherlv_0= 'dto' ( (lv_nom_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_properties_3_0= ruleProperty ) )* otherlv_4= '}' )
            // InternalAsam.g:599:3: otherlv_0= 'dto' ( (lv_nom_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_properties_3_0= ruleProperty ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,27,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getDTOAccess().getDtoKeyword_0());
            		
            // InternalAsam.g:603:3: ( (lv_nom_1_0= RULE_ID ) )
            // InternalAsam.g:604:4: (lv_nom_1_0= RULE_ID )
            {
            // InternalAsam.g:604:4: (lv_nom_1_0= RULE_ID )
            // InternalAsam.g:605:5: lv_nom_1_0= RULE_ID
            {
            lv_nom_1_0=(Token)match(input,RULE_ID,FOLLOW_6); 

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

            otherlv_2=(Token)match(input,14,FOLLOW_21); 

            			newLeafNode(otherlv_2, grammarAccess.getDTOAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalAsam.g:625:3: ( (lv_properties_3_0= ruleProperty ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_ID) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalAsam.g:626:4: (lv_properties_3_0= ruleProperty )
            	    {
            	    // InternalAsam.g:626:4: (lv_properties_3_0= ruleProperty )
            	    // InternalAsam.g:627:5: lv_properties_3_0= ruleProperty
            	    {

            	    					newCompositeNode(grammarAccess.getDTOAccess().getPropertiesPropertyParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_21);
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

            otherlv_4=(Token)match(input,15,FOLLOW_2); 

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
    // InternalAsam.g:652:1: entryRuleService returns [EObject current=null] : iv_ruleService= ruleService EOF ;
    public final EObject entryRuleService() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleService = null;


        try {
            // InternalAsam.g:652:48: (iv_ruleService= ruleService EOF )
            // InternalAsam.g:653:2: iv_ruleService= ruleService EOF
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
    // InternalAsam.g:659:1: ruleService returns [EObject current=null] : (otherlv_0= 'service' ( (lv_nom_1_0= RULE_ID ) ) otherlv_2= 'pertainingTo' ( (otherlv_3= RULE_ID ) ) otherlv_4= '{' ( (lv_actions_5_0= ruleServiceAction ) )* otherlv_6= '}' ) ;
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
            // InternalAsam.g:665:2: ( (otherlv_0= 'service' ( (lv_nom_1_0= RULE_ID ) ) otherlv_2= 'pertainingTo' ( (otherlv_3= RULE_ID ) ) otherlv_4= '{' ( (lv_actions_5_0= ruleServiceAction ) )* otherlv_6= '}' ) )
            // InternalAsam.g:666:2: (otherlv_0= 'service' ( (lv_nom_1_0= RULE_ID ) ) otherlv_2= 'pertainingTo' ( (otherlv_3= RULE_ID ) ) otherlv_4= '{' ( (lv_actions_5_0= ruleServiceAction ) )* otherlv_6= '}' )
            {
            // InternalAsam.g:666:2: (otherlv_0= 'service' ( (lv_nom_1_0= RULE_ID ) ) otherlv_2= 'pertainingTo' ( (otherlv_3= RULE_ID ) ) otherlv_4= '{' ( (lv_actions_5_0= ruleServiceAction ) )* otherlv_6= '}' )
            // InternalAsam.g:667:3: otherlv_0= 'service' ( (lv_nom_1_0= RULE_ID ) ) otherlv_2= 'pertainingTo' ( (otherlv_3= RULE_ID ) ) otherlv_4= '{' ( (lv_actions_5_0= ruleServiceAction ) )* otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,28,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getServiceAccess().getServiceKeyword_0());
            		
            // InternalAsam.g:671:3: ( (lv_nom_1_0= RULE_ID ) )
            // InternalAsam.g:672:4: (lv_nom_1_0= RULE_ID )
            {
            // InternalAsam.g:672:4: (lv_nom_1_0= RULE_ID )
            // InternalAsam.g:673:5: lv_nom_1_0= RULE_ID
            {
            lv_nom_1_0=(Token)match(input,RULE_ID,FOLLOW_22); 

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

            otherlv_2=(Token)match(input,29,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getServiceAccess().getPertainingToKeyword_2());
            		
            // InternalAsam.g:693:3: ( (otherlv_3= RULE_ID ) )
            // InternalAsam.g:694:4: (otherlv_3= RULE_ID )
            {
            // InternalAsam.g:694:4: (otherlv_3= RULE_ID )
            // InternalAsam.g:695:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getServiceRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(otherlv_3, grammarAccess.getServiceAccess().getEntityControllerCrossReference_3_0());
            				

            }


            }

            otherlv_4=(Token)match(input,14,FOLLOW_23); 

            			newLeafNode(otherlv_4, grammarAccess.getServiceAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalAsam.g:710:3: ( (lv_actions_5_0= ruleServiceAction ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==39) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalAsam.g:711:4: (lv_actions_5_0= ruleServiceAction )
            	    {
            	    // InternalAsam.g:711:4: (lv_actions_5_0= ruleServiceAction )
            	    // InternalAsam.g:712:5: lv_actions_5_0= ruleServiceAction
            	    {

            	    					newCompositeNode(grammarAccess.getServiceAccess().getActionsServiceActionParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_23);
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

            otherlv_6=(Token)match(input,15,FOLLOW_2); 

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
    // InternalAsam.g:737:1: entryRuleController returns [EObject current=null] : iv_ruleController= ruleController EOF ;
    public final EObject entryRuleController() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleController = null;


        try {
            // InternalAsam.g:737:51: (iv_ruleController= ruleController EOF )
            // InternalAsam.g:738:2: iv_ruleController= ruleController EOF
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
    // InternalAsam.g:744:1: ruleController returns [EObject current=null] : (otherlv_0= 'controller' ( (lv_nom_1_0= RULE_ID ) ) otherlv_2= 'mappingTo' ( (otherlv_3= RULE_ID ) ) otherlv_4= '{' ( (lv_baseUrl_5_0= RULE_STRING ) )? ( (lv_actions_6_0= ruleControllerAction ) )* otherlv_7= '}' ) ;
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
            // InternalAsam.g:750:2: ( (otherlv_0= 'controller' ( (lv_nom_1_0= RULE_ID ) ) otherlv_2= 'mappingTo' ( (otherlv_3= RULE_ID ) ) otherlv_4= '{' ( (lv_baseUrl_5_0= RULE_STRING ) )? ( (lv_actions_6_0= ruleControllerAction ) )* otherlv_7= '}' ) )
            // InternalAsam.g:751:2: (otherlv_0= 'controller' ( (lv_nom_1_0= RULE_ID ) ) otherlv_2= 'mappingTo' ( (otherlv_3= RULE_ID ) ) otherlv_4= '{' ( (lv_baseUrl_5_0= RULE_STRING ) )? ( (lv_actions_6_0= ruleControllerAction ) )* otherlv_7= '}' )
            {
            // InternalAsam.g:751:2: (otherlv_0= 'controller' ( (lv_nom_1_0= RULE_ID ) ) otherlv_2= 'mappingTo' ( (otherlv_3= RULE_ID ) ) otherlv_4= '{' ( (lv_baseUrl_5_0= RULE_STRING ) )? ( (lv_actions_6_0= ruleControllerAction ) )* otherlv_7= '}' )
            // InternalAsam.g:752:3: otherlv_0= 'controller' ( (lv_nom_1_0= RULE_ID ) ) otherlv_2= 'mappingTo' ( (otherlv_3= RULE_ID ) ) otherlv_4= '{' ( (lv_baseUrl_5_0= RULE_STRING ) )? ( (lv_actions_6_0= ruleControllerAction ) )* otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,30,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getControllerAccess().getControllerKeyword_0());
            		
            // InternalAsam.g:756:3: ( (lv_nom_1_0= RULE_ID ) )
            // InternalAsam.g:757:4: (lv_nom_1_0= RULE_ID )
            {
            // InternalAsam.g:757:4: (lv_nom_1_0= RULE_ID )
            // InternalAsam.g:758:5: lv_nom_1_0= RULE_ID
            {
            lv_nom_1_0=(Token)match(input,RULE_ID,FOLLOW_24); 

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

            otherlv_2=(Token)match(input,31,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getControllerAccess().getMappingToKeyword_2());
            		
            // InternalAsam.g:778:3: ( (otherlv_3= RULE_ID ) )
            // InternalAsam.g:779:4: (otherlv_3= RULE_ID )
            {
            // InternalAsam.g:779:4: (otherlv_3= RULE_ID )
            // InternalAsam.g:780:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getControllerRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(otherlv_3, grammarAccess.getControllerAccess().getEntityEntityCrossReference_3_0());
            				

            }


            }

            otherlv_4=(Token)match(input,14,FOLLOW_25); 

            			newLeafNode(otherlv_4, grammarAccess.getControllerAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalAsam.g:795:3: ( (lv_baseUrl_5_0= RULE_STRING ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_STRING) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalAsam.g:796:4: (lv_baseUrl_5_0= RULE_STRING )
                    {
                    // InternalAsam.g:796:4: (lv_baseUrl_5_0= RULE_STRING )
                    // InternalAsam.g:797:5: lv_baseUrl_5_0= RULE_STRING
                    {
                    lv_baseUrl_5_0=(Token)match(input,RULE_STRING,FOLLOW_26); 

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

            // InternalAsam.g:813:3: ( (lv_actions_6_0= ruleControllerAction ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>=61 && LA13_0<=65)) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalAsam.g:814:4: (lv_actions_6_0= ruleControllerAction )
            	    {
            	    // InternalAsam.g:814:4: (lv_actions_6_0= ruleControllerAction )
            	    // InternalAsam.g:815:5: lv_actions_6_0= ruleControllerAction
            	    {

            	    					newCompositeNode(grammarAccess.getControllerAccess().getActionsControllerActionParserRuleCall_6_0());
            	    				
            	    pushFollow(FOLLOW_26);
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

            otherlv_7=(Token)match(input,15,FOLLOW_2); 

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
    // InternalAsam.g:840:1: entryRuleRepository returns [EObject current=null] : iv_ruleRepository= ruleRepository EOF ;
    public final EObject entryRuleRepository() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRepository = null;


        try {
            // InternalAsam.g:840:51: (iv_ruleRepository= ruleRepository EOF )
            // InternalAsam.g:841:2: iv_ruleRepository= ruleRepository EOF
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
    // InternalAsam.g:847:1: ruleRepository returns [EObject current=null] : (otherlv_0= 'repository' ( (lv_nom_1_0= RULE_ID ) ) otherlv_2= 'for' ( (otherlv_3= RULE_ID ) ) otherlv_4= '{' ( (lv_methods_5_0= ruleRepositoryMethod ) )* otherlv_6= '}' ) ;
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
            // InternalAsam.g:853:2: ( (otherlv_0= 'repository' ( (lv_nom_1_0= RULE_ID ) ) otherlv_2= 'for' ( (otherlv_3= RULE_ID ) ) otherlv_4= '{' ( (lv_methods_5_0= ruleRepositoryMethod ) )* otherlv_6= '}' ) )
            // InternalAsam.g:854:2: (otherlv_0= 'repository' ( (lv_nom_1_0= RULE_ID ) ) otherlv_2= 'for' ( (otherlv_3= RULE_ID ) ) otherlv_4= '{' ( (lv_methods_5_0= ruleRepositoryMethod ) )* otherlv_6= '}' )
            {
            // InternalAsam.g:854:2: (otherlv_0= 'repository' ( (lv_nom_1_0= RULE_ID ) ) otherlv_2= 'for' ( (otherlv_3= RULE_ID ) ) otherlv_4= '{' ( (lv_methods_5_0= ruleRepositoryMethod ) )* otherlv_6= '}' )
            // InternalAsam.g:855:3: otherlv_0= 'repository' ( (lv_nom_1_0= RULE_ID ) ) otherlv_2= 'for' ( (otherlv_3= RULE_ID ) ) otherlv_4= '{' ( (lv_methods_5_0= ruleRepositoryMethod ) )* otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,32,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getRepositoryAccess().getRepositoryKeyword_0());
            		
            // InternalAsam.g:859:3: ( (lv_nom_1_0= RULE_ID ) )
            // InternalAsam.g:860:4: (lv_nom_1_0= RULE_ID )
            {
            // InternalAsam.g:860:4: (lv_nom_1_0= RULE_ID )
            // InternalAsam.g:861:5: lv_nom_1_0= RULE_ID
            {
            lv_nom_1_0=(Token)match(input,RULE_ID,FOLLOW_27); 

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

            otherlv_2=(Token)match(input,33,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getRepositoryAccess().getForKeyword_2());
            		
            // InternalAsam.g:881:3: ( (otherlv_3= RULE_ID ) )
            // InternalAsam.g:882:4: (otherlv_3= RULE_ID )
            {
            // InternalAsam.g:882:4: (otherlv_3= RULE_ID )
            // InternalAsam.g:883:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRepositoryRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(otherlv_3, grammarAccess.getRepositoryAccess().getEntityEntityCrossReference_3_0());
            				

            }


            }

            otherlv_4=(Token)match(input,14,FOLLOW_28); 

            			newLeafNode(otherlv_4, grammarAccess.getRepositoryAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalAsam.g:898:3: ( (lv_methods_5_0= ruleRepositoryMethod ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==34||(LA14_0>=37 && LA14_0<=38)) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalAsam.g:899:4: (lv_methods_5_0= ruleRepositoryMethod )
            	    {
            	    // InternalAsam.g:899:4: (lv_methods_5_0= ruleRepositoryMethod )
            	    // InternalAsam.g:900:5: lv_methods_5_0= ruleRepositoryMethod
            	    {

            	    					newCompositeNode(grammarAccess.getRepositoryAccess().getMethodsRepositoryMethodParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_28);
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

            otherlv_6=(Token)match(input,15,FOLLOW_2); 

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
    // InternalAsam.g:925:1: entryRuleRepositoryMethod returns [EObject current=null] : iv_ruleRepositoryMethod= ruleRepositoryMethod EOF ;
    public final EObject entryRuleRepositoryMethod() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRepositoryMethod = null;


        try {
            // InternalAsam.g:925:57: (iv_ruleRepositoryMethod= ruleRepositoryMethod EOF )
            // InternalAsam.g:926:2: iv_ruleRepositoryMethod= ruleRepositoryMethod EOF
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
    // InternalAsam.g:932:1: ruleRepositoryMethod returns [EObject current=null] : (this_FindByMethod_0= ruleFindByMethod | this_DeleteByMethod_1= ruleDeleteByMethod | this_CustomQueryMethod_2= ruleCustomQueryMethod ) ;
    public final EObject ruleRepositoryMethod() throws RecognitionException {
        EObject current = null;

        EObject this_FindByMethod_0 = null;

        EObject this_DeleteByMethod_1 = null;

        EObject this_CustomQueryMethod_2 = null;



        	enterRule();

        try {
            // InternalAsam.g:938:2: ( (this_FindByMethod_0= ruleFindByMethod | this_DeleteByMethod_1= ruleDeleteByMethod | this_CustomQueryMethod_2= ruleCustomQueryMethod ) )
            // InternalAsam.g:939:2: (this_FindByMethod_0= ruleFindByMethod | this_DeleteByMethod_1= ruleDeleteByMethod | this_CustomQueryMethod_2= ruleCustomQueryMethod )
            {
            // InternalAsam.g:939:2: (this_FindByMethod_0= ruleFindByMethod | this_DeleteByMethod_1= ruleDeleteByMethod | this_CustomQueryMethod_2= ruleCustomQueryMethod )
            int alt15=3;
            switch ( input.LA(1) ) {
            case 34:
                {
                alt15=1;
                }
                break;
            case 37:
                {
                alt15=2;
                }
                break;
            case 38:
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
                    // InternalAsam.g:940:3: this_FindByMethod_0= ruleFindByMethod
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
                    // InternalAsam.g:949:3: this_DeleteByMethod_1= ruleDeleteByMethod
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
                    // InternalAsam.g:958:3: this_CustomQueryMethod_2= ruleCustomQueryMethod
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
    // InternalAsam.g:970:1: entryRuleFindByMethod returns [EObject current=null] : iv_ruleFindByMethod= ruleFindByMethod EOF ;
    public final EObject entryRuleFindByMethod() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFindByMethod = null;


        try {
            // InternalAsam.g:970:53: (iv_ruleFindByMethod= ruleFindByMethod EOF )
            // InternalAsam.g:971:2: iv_ruleFindByMethod= ruleFindByMethod EOF
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
    // InternalAsam.g:977:1: ruleFindByMethod returns [EObject current=null] : (otherlv_0= 'find' otherlv_1= 'by' ( (lv_property_2_0= RULE_ID ) ) otherlv_3= 'And' ( (lv_prop_4_0= RULE_ID ) ) ) ;
    public final EObject ruleFindByMethod() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_property_2_0=null;
        Token otherlv_3=null;
        Token lv_prop_4_0=null;


        	enterRule();

        try {
            // InternalAsam.g:983:2: ( (otherlv_0= 'find' otherlv_1= 'by' ( (lv_property_2_0= RULE_ID ) ) otherlv_3= 'And' ( (lv_prop_4_0= RULE_ID ) ) ) )
            // InternalAsam.g:984:2: (otherlv_0= 'find' otherlv_1= 'by' ( (lv_property_2_0= RULE_ID ) ) otherlv_3= 'And' ( (lv_prop_4_0= RULE_ID ) ) )
            {
            // InternalAsam.g:984:2: (otherlv_0= 'find' otherlv_1= 'by' ( (lv_property_2_0= RULE_ID ) ) otherlv_3= 'And' ( (lv_prop_4_0= RULE_ID ) ) )
            // InternalAsam.g:985:3: otherlv_0= 'find' otherlv_1= 'by' ( (lv_property_2_0= RULE_ID ) ) otherlv_3= 'And' ( (lv_prop_4_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,34,FOLLOW_29); 

            			newLeafNode(otherlv_0, grammarAccess.getFindByMethodAccess().getFindKeyword_0());
            		
            otherlv_1=(Token)match(input,35,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getFindByMethodAccess().getByKeyword_1());
            		
            // InternalAsam.g:993:3: ( (lv_property_2_0= RULE_ID ) )
            // InternalAsam.g:994:4: (lv_property_2_0= RULE_ID )
            {
            // InternalAsam.g:994:4: (lv_property_2_0= RULE_ID )
            // InternalAsam.g:995:5: lv_property_2_0= RULE_ID
            {
            lv_property_2_0=(Token)match(input,RULE_ID,FOLLOW_30); 

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

            otherlv_3=(Token)match(input,36,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getFindByMethodAccess().getAndKeyword_3());
            		
            // InternalAsam.g:1015:3: ( (lv_prop_4_0= RULE_ID ) )
            // InternalAsam.g:1016:4: (lv_prop_4_0= RULE_ID )
            {
            // InternalAsam.g:1016:4: (lv_prop_4_0= RULE_ID )
            // InternalAsam.g:1017:5: lv_prop_4_0= RULE_ID
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
    // InternalAsam.g:1037:1: entryRuleDeleteByMethod returns [EObject current=null] : iv_ruleDeleteByMethod= ruleDeleteByMethod EOF ;
    public final EObject entryRuleDeleteByMethod() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeleteByMethod = null;


        try {
            // InternalAsam.g:1037:55: (iv_ruleDeleteByMethod= ruleDeleteByMethod EOF )
            // InternalAsam.g:1038:2: iv_ruleDeleteByMethod= ruleDeleteByMethod EOF
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
    // InternalAsam.g:1044:1: ruleDeleteByMethod returns [EObject current=null] : (otherlv_0= 'delete' otherlv_1= 'by' ( (lv_property_2_0= RULE_ID ) ) otherlv_3= 'And' ( (lv_prop_4_0= RULE_ID ) ) ) ;
    public final EObject ruleDeleteByMethod() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_property_2_0=null;
        Token otherlv_3=null;
        Token lv_prop_4_0=null;


        	enterRule();

        try {
            // InternalAsam.g:1050:2: ( (otherlv_0= 'delete' otherlv_1= 'by' ( (lv_property_2_0= RULE_ID ) ) otherlv_3= 'And' ( (lv_prop_4_0= RULE_ID ) ) ) )
            // InternalAsam.g:1051:2: (otherlv_0= 'delete' otherlv_1= 'by' ( (lv_property_2_0= RULE_ID ) ) otherlv_3= 'And' ( (lv_prop_4_0= RULE_ID ) ) )
            {
            // InternalAsam.g:1051:2: (otherlv_0= 'delete' otherlv_1= 'by' ( (lv_property_2_0= RULE_ID ) ) otherlv_3= 'And' ( (lv_prop_4_0= RULE_ID ) ) )
            // InternalAsam.g:1052:3: otherlv_0= 'delete' otherlv_1= 'by' ( (lv_property_2_0= RULE_ID ) ) otherlv_3= 'And' ( (lv_prop_4_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,37,FOLLOW_29); 

            			newLeafNode(otherlv_0, grammarAccess.getDeleteByMethodAccess().getDeleteKeyword_0());
            		
            otherlv_1=(Token)match(input,35,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getDeleteByMethodAccess().getByKeyword_1());
            		
            // InternalAsam.g:1060:3: ( (lv_property_2_0= RULE_ID ) )
            // InternalAsam.g:1061:4: (lv_property_2_0= RULE_ID )
            {
            // InternalAsam.g:1061:4: (lv_property_2_0= RULE_ID )
            // InternalAsam.g:1062:5: lv_property_2_0= RULE_ID
            {
            lv_property_2_0=(Token)match(input,RULE_ID,FOLLOW_30); 

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

            otherlv_3=(Token)match(input,36,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getDeleteByMethodAccess().getAndKeyword_3());
            		
            // InternalAsam.g:1082:3: ( (lv_prop_4_0= RULE_ID ) )
            // InternalAsam.g:1083:4: (lv_prop_4_0= RULE_ID )
            {
            // InternalAsam.g:1083:4: (lv_prop_4_0= RULE_ID )
            // InternalAsam.g:1084:5: lv_prop_4_0= RULE_ID
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
    // InternalAsam.g:1104:1: entryRuleCustomQueryMethod returns [EObject current=null] : iv_ruleCustomQueryMethod= ruleCustomQueryMethod EOF ;
    public final EObject entryRuleCustomQueryMethod() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCustomQueryMethod = null;


        try {
            // InternalAsam.g:1104:58: (iv_ruleCustomQueryMethod= ruleCustomQueryMethod EOF )
            // InternalAsam.g:1105:2: iv_ruleCustomQueryMethod= ruleCustomQueryMethod EOF
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
    // InternalAsam.g:1111:1: ruleCustomQueryMethod returns [EObject current=null] : (otherlv_0= 'customQuery' otherlv_1= '{' ( (lv_query_2_0= RULE_STRING ) ) otherlv_3= '}' ) ;
    public final EObject ruleCustomQueryMethod() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_query_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalAsam.g:1117:2: ( (otherlv_0= 'customQuery' otherlv_1= '{' ( (lv_query_2_0= RULE_STRING ) ) otherlv_3= '}' ) )
            // InternalAsam.g:1118:2: (otherlv_0= 'customQuery' otherlv_1= '{' ( (lv_query_2_0= RULE_STRING ) ) otherlv_3= '}' )
            {
            // InternalAsam.g:1118:2: (otherlv_0= 'customQuery' otherlv_1= '{' ( (lv_query_2_0= RULE_STRING ) ) otherlv_3= '}' )
            // InternalAsam.g:1119:3: otherlv_0= 'customQuery' otherlv_1= '{' ( (lv_query_2_0= RULE_STRING ) ) otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,38,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getCustomQueryMethodAccess().getCustomQueryKeyword_0());
            		
            otherlv_1=(Token)match(input,14,FOLLOW_31); 

            			newLeafNode(otherlv_1, grammarAccess.getCustomQueryMethodAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalAsam.g:1127:3: ( (lv_query_2_0= RULE_STRING ) )
            // InternalAsam.g:1128:4: (lv_query_2_0= RULE_STRING )
            {
            // InternalAsam.g:1128:4: (lv_query_2_0= RULE_STRING )
            // InternalAsam.g:1129:5: lv_query_2_0= RULE_STRING
            {
            lv_query_2_0=(Token)match(input,RULE_STRING,FOLLOW_9); 

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

            otherlv_3=(Token)match(input,15,FOLLOW_2); 

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
    // InternalAsam.g:1153:1: entryRuleServiceAction returns [EObject current=null] : iv_ruleServiceAction= ruleServiceAction EOF ;
    public final EObject entryRuleServiceAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleServiceAction = null;


        try {
            // InternalAsam.g:1153:54: (iv_ruleServiceAction= ruleServiceAction EOF )
            // InternalAsam.g:1154:2: iv_ruleServiceAction= ruleServiceAction EOF
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
    // InternalAsam.g:1160:1: ruleServiceAction returns [EObject current=null] : (otherlv_0= 'operation' ( (lv_nom_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'returns' ( (lv_returnType_4_0= ruleRType ) ) (otherlv_5= 'raises' ( (lv_exceptionType_6_0= ruleType ) ) )? (otherlv_7= 'implementation' ( (lv_implementation_8_0= RULE_STRING ) ) )? otherlv_9= 'params' otherlv_10= '(' ( (lv_parameters_11_0= ruleActionParameter ) )* otherlv_12= ')' otherlv_13= '}' ) ;
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
            // InternalAsam.g:1166:2: ( (otherlv_0= 'operation' ( (lv_nom_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'returns' ( (lv_returnType_4_0= ruleRType ) ) (otherlv_5= 'raises' ( (lv_exceptionType_6_0= ruleType ) ) )? (otherlv_7= 'implementation' ( (lv_implementation_8_0= RULE_STRING ) ) )? otherlv_9= 'params' otherlv_10= '(' ( (lv_parameters_11_0= ruleActionParameter ) )* otherlv_12= ')' otherlv_13= '}' ) )
            // InternalAsam.g:1167:2: (otherlv_0= 'operation' ( (lv_nom_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'returns' ( (lv_returnType_4_0= ruleRType ) ) (otherlv_5= 'raises' ( (lv_exceptionType_6_0= ruleType ) ) )? (otherlv_7= 'implementation' ( (lv_implementation_8_0= RULE_STRING ) ) )? otherlv_9= 'params' otherlv_10= '(' ( (lv_parameters_11_0= ruleActionParameter ) )* otherlv_12= ')' otherlv_13= '}' )
            {
            // InternalAsam.g:1167:2: (otherlv_0= 'operation' ( (lv_nom_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'returns' ( (lv_returnType_4_0= ruleRType ) ) (otherlv_5= 'raises' ( (lv_exceptionType_6_0= ruleType ) ) )? (otherlv_7= 'implementation' ( (lv_implementation_8_0= RULE_STRING ) ) )? otherlv_9= 'params' otherlv_10= '(' ( (lv_parameters_11_0= ruleActionParameter ) )* otherlv_12= ')' otherlv_13= '}' )
            // InternalAsam.g:1168:3: otherlv_0= 'operation' ( (lv_nom_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'returns' ( (lv_returnType_4_0= ruleRType ) ) (otherlv_5= 'raises' ( (lv_exceptionType_6_0= ruleType ) ) )? (otherlv_7= 'implementation' ( (lv_implementation_8_0= RULE_STRING ) ) )? otherlv_9= 'params' otherlv_10= '(' ( (lv_parameters_11_0= ruleActionParameter ) )* otherlv_12= ')' otherlv_13= '}'
            {
            otherlv_0=(Token)match(input,39,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getServiceActionAccess().getOperationKeyword_0());
            		
            // InternalAsam.g:1172:3: ( (lv_nom_1_0= RULE_ID ) )
            // InternalAsam.g:1173:4: (lv_nom_1_0= RULE_ID )
            {
            // InternalAsam.g:1173:4: (lv_nom_1_0= RULE_ID )
            // InternalAsam.g:1174:5: lv_nom_1_0= RULE_ID
            {
            lv_nom_1_0=(Token)match(input,RULE_ID,FOLLOW_6); 

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

            otherlv_2=(Token)match(input,14,FOLLOW_32); 

            			newLeafNode(otherlv_2, grammarAccess.getServiceActionAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,40,FOLLOW_33); 

            			newLeafNode(otherlv_3, grammarAccess.getServiceActionAccess().getReturnsKeyword_3());
            		
            // InternalAsam.g:1198:3: ( (lv_returnType_4_0= ruleRType ) )
            // InternalAsam.g:1199:4: (lv_returnType_4_0= ruleRType )
            {
            // InternalAsam.g:1199:4: (lv_returnType_4_0= ruleRType )
            // InternalAsam.g:1200:5: lv_returnType_4_0= ruleRType
            {

            					newCompositeNode(grammarAccess.getServiceActionAccess().getReturnTypeRTypeParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_34);
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

            // InternalAsam.g:1217:3: (otherlv_5= 'raises' ( (lv_exceptionType_6_0= ruleType ) ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==41) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalAsam.g:1218:4: otherlv_5= 'raises' ( (lv_exceptionType_6_0= ruleType ) )
                    {
                    otherlv_5=(Token)match(input,41,FOLLOW_35); 

                    				newLeafNode(otherlv_5, grammarAccess.getServiceActionAccess().getRaisesKeyword_5_0());
                    			
                    // InternalAsam.g:1222:4: ( (lv_exceptionType_6_0= ruleType ) )
                    // InternalAsam.g:1223:5: (lv_exceptionType_6_0= ruleType )
                    {
                    // InternalAsam.g:1223:5: (lv_exceptionType_6_0= ruleType )
                    // InternalAsam.g:1224:6: lv_exceptionType_6_0= ruleType
                    {

                    						newCompositeNode(grammarAccess.getServiceActionAccess().getExceptionTypeTypeParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_36);
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

            // InternalAsam.g:1242:3: (otherlv_7= 'implementation' ( (lv_implementation_8_0= RULE_STRING ) ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==42) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalAsam.g:1243:4: otherlv_7= 'implementation' ( (lv_implementation_8_0= RULE_STRING ) )
                    {
                    otherlv_7=(Token)match(input,42,FOLLOW_31); 

                    				newLeafNode(otherlv_7, grammarAccess.getServiceActionAccess().getImplementationKeyword_6_0());
                    			
                    // InternalAsam.g:1247:4: ( (lv_implementation_8_0= RULE_STRING ) )
                    // InternalAsam.g:1248:5: (lv_implementation_8_0= RULE_STRING )
                    {
                    // InternalAsam.g:1248:5: (lv_implementation_8_0= RULE_STRING )
                    // InternalAsam.g:1249:6: lv_implementation_8_0= RULE_STRING
                    {
                    lv_implementation_8_0=(Token)match(input,RULE_STRING,FOLLOW_37); 

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

            otherlv_9=(Token)match(input,43,FOLLOW_38); 

            			newLeafNode(otherlv_9, grammarAccess.getServiceActionAccess().getParamsKeyword_7());
            		
            otherlv_10=(Token)match(input,44,FOLLOW_39); 

            			newLeafNode(otherlv_10, grammarAccess.getServiceActionAccess().getLeftParenthesisKeyword_8());
            		
            // InternalAsam.g:1274:3: ( (lv_parameters_11_0= ruleActionParameter ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==RULE_ID) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalAsam.g:1275:4: (lv_parameters_11_0= ruleActionParameter )
            	    {
            	    // InternalAsam.g:1275:4: (lv_parameters_11_0= ruleActionParameter )
            	    // InternalAsam.g:1276:5: lv_parameters_11_0= ruleActionParameter
            	    {

            	    					newCompositeNode(grammarAccess.getServiceActionAccess().getParametersActionParameterParserRuleCall_9_0());
            	    				
            	    pushFollow(FOLLOW_39);
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

            otherlv_12=(Token)match(input,45,FOLLOW_9); 

            			newLeafNode(otherlv_12, grammarAccess.getServiceActionAccess().getRightParenthesisKeyword_10());
            		
            otherlv_13=(Token)match(input,15,FOLLOW_2); 

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
    // InternalAsam.g:1305:1: entryRuleControllerAction returns [EObject current=null] : iv_ruleControllerAction= ruleControllerAction EOF ;
    public final EObject entryRuleControllerAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleControllerAction = null;


        try {
            // InternalAsam.g:1305:57: (iv_ruleControllerAction= ruleControllerAction EOF )
            // InternalAsam.g:1306:2: iv_ruleControllerAction= ruleControllerAction EOF
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
    // InternalAsam.g:1312:1: ruleControllerAction returns [EObject current=null] : ( ( (lv_method_0_0= ruleHttpMethods ) ) otherlv_1= 'action' ( (lv_nom_2_0= RULE_ID ) ) otherlv_3= '{' otherlv_4= 'linkedTo' ( (lv_serviceAction_5_0= RULE_ID ) ) (otherlv_6= 'mappedAt' ( (lv_url_7_0= RULE_STRING ) ) )? ( (lv_parameters_8_0= ruleActionParameter ) )* otherlv_9= '}' ) ;
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
            // InternalAsam.g:1318:2: ( ( ( (lv_method_0_0= ruleHttpMethods ) ) otherlv_1= 'action' ( (lv_nom_2_0= RULE_ID ) ) otherlv_3= '{' otherlv_4= 'linkedTo' ( (lv_serviceAction_5_0= RULE_ID ) ) (otherlv_6= 'mappedAt' ( (lv_url_7_0= RULE_STRING ) ) )? ( (lv_parameters_8_0= ruleActionParameter ) )* otherlv_9= '}' ) )
            // InternalAsam.g:1319:2: ( ( (lv_method_0_0= ruleHttpMethods ) ) otherlv_1= 'action' ( (lv_nom_2_0= RULE_ID ) ) otherlv_3= '{' otherlv_4= 'linkedTo' ( (lv_serviceAction_5_0= RULE_ID ) ) (otherlv_6= 'mappedAt' ( (lv_url_7_0= RULE_STRING ) ) )? ( (lv_parameters_8_0= ruleActionParameter ) )* otherlv_9= '}' )
            {
            // InternalAsam.g:1319:2: ( ( (lv_method_0_0= ruleHttpMethods ) ) otherlv_1= 'action' ( (lv_nom_2_0= RULE_ID ) ) otherlv_3= '{' otherlv_4= 'linkedTo' ( (lv_serviceAction_5_0= RULE_ID ) ) (otherlv_6= 'mappedAt' ( (lv_url_7_0= RULE_STRING ) ) )? ( (lv_parameters_8_0= ruleActionParameter ) )* otherlv_9= '}' )
            // InternalAsam.g:1320:3: ( (lv_method_0_0= ruleHttpMethods ) ) otherlv_1= 'action' ( (lv_nom_2_0= RULE_ID ) ) otherlv_3= '{' otherlv_4= 'linkedTo' ( (lv_serviceAction_5_0= RULE_ID ) ) (otherlv_6= 'mappedAt' ( (lv_url_7_0= RULE_STRING ) ) )? ( (lv_parameters_8_0= ruleActionParameter ) )* otherlv_9= '}'
            {
            // InternalAsam.g:1320:3: ( (lv_method_0_0= ruleHttpMethods ) )
            // InternalAsam.g:1321:4: (lv_method_0_0= ruleHttpMethods )
            {
            // InternalAsam.g:1321:4: (lv_method_0_0= ruleHttpMethods )
            // InternalAsam.g:1322:5: lv_method_0_0= ruleHttpMethods
            {

            					newCompositeNode(grammarAccess.getControllerActionAccess().getMethodHttpMethodsEnumRuleCall_0_0());
            				
            pushFollow(FOLLOW_40);
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

            otherlv_1=(Token)match(input,46,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getControllerActionAccess().getActionKeyword_1());
            		
            // InternalAsam.g:1343:3: ( (lv_nom_2_0= RULE_ID ) )
            // InternalAsam.g:1344:4: (lv_nom_2_0= RULE_ID )
            {
            // InternalAsam.g:1344:4: (lv_nom_2_0= RULE_ID )
            // InternalAsam.g:1345:5: lv_nom_2_0= RULE_ID
            {
            lv_nom_2_0=(Token)match(input,RULE_ID,FOLLOW_6); 

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

            otherlv_3=(Token)match(input,14,FOLLOW_41); 

            			newLeafNode(otherlv_3, grammarAccess.getControllerActionAccess().getLeftCurlyBracketKeyword_3());
            		
            otherlv_4=(Token)match(input,47,FOLLOW_3); 

            			newLeafNode(otherlv_4, grammarAccess.getControllerActionAccess().getLinkedToKeyword_4());
            		
            // InternalAsam.g:1369:3: ( (lv_serviceAction_5_0= RULE_ID ) )
            // InternalAsam.g:1370:4: (lv_serviceAction_5_0= RULE_ID )
            {
            // InternalAsam.g:1370:4: (lv_serviceAction_5_0= RULE_ID )
            // InternalAsam.g:1371:5: lv_serviceAction_5_0= RULE_ID
            {
            lv_serviceAction_5_0=(Token)match(input,RULE_ID,FOLLOW_42); 

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

            // InternalAsam.g:1387:3: (otherlv_6= 'mappedAt' ( (lv_url_7_0= RULE_STRING ) ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==48) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalAsam.g:1388:4: otherlv_6= 'mappedAt' ( (lv_url_7_0= RULE_STRING ) )
                    {
                    otherlv_6=(Token)match(input,48,FOLLOW_31); 

                    				newLeafNode(otherlv_6, grammarAccess.getControllerActionAccess().getMappedAtKeyword_6_0());
                    			
                    // InternalAsam.g:1392:4: ( (lv_url_7_0= RULE_STRING ) )
                    // InternalAsam.g:1393:5: (lv_url_7_0= RULE_STRING )
                    {
                    // InternalAsam.g:1393:5: (lv_url_7_0= RULE_STRING )
                    // InternalAsam.g:1394:6: lv_url_7_0= RULE_STRING
                    {
                    lv_url_7_0=(Token)match(input,RULE_STRING,FOLLOW_21); 

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

            // InternalAsam.g:1411:3: ( (lv_parameters_8_0= ruleActionParameter ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==RULE_ID) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalAsam.g:1412:4: (lv_parameters_8_0= ruleActionParameter )
            	    {
            	    // InternalAsam.g:1412:4: (lv_parameters_8_0= ruleActionParameter )
            	    // InternalAsam.g:1413:5: lv_parameters_8_0= ruleActionParameter
            	    {

            	    					newCompositeNode(grammarAccess.getControllerActionAccess().getParametersActionParameterParserRuleCall_7_0());
            	    				
            	    pushFollow(FOLLOW_21);
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

            otherlv_9=(Token)match(input,15,FOLLOW_2); 

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
    // InternalAsam.g:1438:1: entryRuleActionParameter returns [EObject current=null] : iv_ruleActionParameter= ruleActionParameter EOF ;
    public final EObject entryRuleActionParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActionParameter = null;


        try {
            // InternalAsam.g:1438:56: (iv_ruleActionParameter= ruleActionParameter EOF )
            // InternalAsam.g:1439:2: iv_ruleActionParameter= ruleActionParameter EOF
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
    // InternalAsam.g:1445:1: ruleActionParameter returns [EObject current=null] : ( ( (lv_nom_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleType ) ) (otherlv_3= 'default' ( (lv_defaultValue_4_0= RULE_STRING ) ) )? ) ;
    public final EObject ruleActionParameter() throws RecognitionException {
        EObject current = null;

        Token lv_nom_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token lv_defaultValue_4_0=null;
        EObject lv_type_2_0 = null;



        	enterRule();

        try {
            // InternalAsam.g:1451:2: ( ( ( (lv_nom_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleType ) ) (otherlv_3= 'default' ( (lv_defaultValue_4_0= RULE_STRING ) ) )? ) )
            // InternalAsam.g:1452:2: ( ( (lv_nom_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleType ) ) (otherlv_3= 'default' ( (lv_defaultValue_4_0= RULE_STRING ) ) )? )
            {
            // InternalAsam.g:1452:2: ( ( (lv_nom_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleType ) ) (otherlv_3= 'default' ( (lv_defaultValue_4_0= RULE_STRING ) ) )? )
            // InternalAsam.g:1453:3: ( (lv_nom_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleType ) ) (otherlv_3= 'default' ( (lv_defaultValue_4_0= RULE_STRING ) ) )?
            {
            // InternalAsam.g:1453:3: ( (lv_nom_0_0= RULE_ID ) )
            // InternalAsam.g:1454:4: (lv_nom_0_0= RULE_ID )
            {
            // InternalAsam.g:1454:4: (lv_nom_0_0= RULE_ID )
            // InternalAsam.g:1455:5: lv_nom_0_0= RULE_ID
            {
            lv_nom_0_0=(Token)match(input,RULE_ID,FOLLOW_43); 

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

            otherlv_1=(Token)match(input,49,FOLLOW_35); 

            			newLeafNode(otherlv_1, grammarAccess.getActionParameterAccess().getColonKeyword_1());
            		
            // InternalAsam.g:1475:3: ( (lv_type_2_0= ruleType ) )
            // InternalAsam.g:1476:4: (lv_type_2_0= ruleType )
            {
            // InternalAsam.g:1476:4: (lv_type_2_0= ruleType )
            // InternalAsam.g:1477:5: lv_type_2_0= ruleType
            {

            					newCompositeNode(grammarAccess.getActionParameterAccess().getTypeTypeParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_44);
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

            // InternalAsam.g:1494:3: (otherlv_3= 'default' ( (lv_defaultValue_4_0= RULE_STRING ) ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==50) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalAsam.g:1495:4: otherlv_3= 'default' ( (lv_defaultValue_4_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,50,FOLLOW_31); 

                    				newLeafNode(otherlv_3, grammarAccess.getActionParameterAccess().getDefaultKeyword_3_0());
                    			
                    // InternalAsam.g:1499:4: ( (lv_defaultValue_4_0= RULE_STRING ) )
                    // InternalAsam.g:1500:5: (lv_defaultValue_4_0= RULE_STRING )
                    {
                    // InternalAsam.g:1500:5: (lv_defaultValue_4_0= RULE_STRING )
                    // InternalAsam.g:1501:6: lv_defaultValue_4_0= RULE_STRING
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
    // InternalAsam.g:1522:1: entryRuleProperty returns [EObject current=null] : iv_ruleProperty= ruleProperty EOF ;
    public final EObject entryRuleProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProperty = null;


        try {
            // InternalAsam.g:1522:49: (iv_ruleProperty= ruleProperty EOF )
            // InternalAsam.g:1523:2: iv_ruleProperty= ruleProperty EOF
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
    // InternalAsam.g:1529:1: ruleProperty returns [EObject current=null] : ( ( (lv_nom_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleType ) ) (otherlv_3= 'default' ( (lv_defaultValue_4_0= RULE_STRING ) ) )? ) ;
    public final EObject ruleProperty() throws RecognitionException {
        EObject current = null;

        Token lv_nom_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token lv_defaultValue_4_0=null;
        EObject lv_type_2_0 = null;



        	enterRule();

        try {
            // InternalAsam.g:1535:2: ( ( ( (lv_nom_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleType ) ) (otherlv_3= 'default' ( (lv_defaultValue_4_0= RULE_STRING ) ) )? ) )
            // InternalAsam.g:1536:2: ( ( (lv_nom_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleType ) ) (otherlv_3= 'default' ( (lv_defaultValue_4_0= RULE_STRING ) ) )? )
            {
            // InternalAsam.g:1536:2: ( ( (lv_nom_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleType ) ) (otherlv_3= 'default' ( (lv_defaultValue_4_0= RULE_STRING ) ) )? )
            // InternalAsam.g:1537:3: ( (lv_nom_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleType ) ) (otherlv_3= 'default' ( (lv_defaultValue_4_0= RULE_STRING ) ) )?
            {
            // InternalAsam.g:1537:3: ( (lv_nom_0_0= RULE_ID ) )
            // InternalAsam.g:1538:4: (lv_nom_0_0= RULE_ID )
            {
            // InternalAsam.g:1538:4: (lv_nom_0_0= RULE_ID )
            // InternalAsam.g:1539:5: lv_nom_0_0= RULE_ID
            {
            lv_nom_0_0=(Token)match(input,RULE_ID,FOLLOW_43); 

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

            otherlv_1=(Token)match(input,49,FOLLOW_35); 

            			newLeafNode(otherlv_1, grammarAccess.getPropertyAccess().getColonKeyword_1());
            		
            // InternalAsam.g:1559:3: ( (lv_type_2_0= ruleType ) )
            // InternalAsam.g:1560:4: (lv_type_2_0= ruleType )
            {
            // InternalAsam.g:1560:4: (lv_type_2_0= ruleType )
            // InternalAsam.g:1561:5: lv_type_2_0= ruleType
            {

            					newCompositeNode(grammarAccess.getPropertyAccess().getTypeTypeParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_44);
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

            // InternalAsam.g:1578:3: (otherlv_3= 'default' ( (lv_defaultValue_4_0= RULE_STRING ) ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==50) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalAsam.g:1579:4: otherlv_3= 'default' ( (lv_defaultValue_4_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,50,FOLLOW_31); 

                    				newLeafNode(otherlv_3, grammarAccess.getPropertyAccess().getDefaultKeyword_3_0());
                    			
                    // InternalAsam.g:1583:4: ( (lv_defaultValue_4_0= RULE_STRING ) )
                    // InternalAsam.g:1584:5: (lv_defaultValue_4_0= RULE_STRING )
                    {
                    // InternalAsam.g:1584:5: (lv_defaultValue_4_0= RULE_STRING )
                    // InternalAsam.g:1585:6: lv_defaultValue_4_0= RULE_STRING
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
    // InternalAsam.g:1606:1: entryRuleType returns [EObject current=null] : iv_ruleType= ruleType EOF ;
    public final EObject entryRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType = null;


        try {
            // InternalAsam.g:1606:45: (iv_ruleType= ruleType EOF )
            // InternalAsam.g:1607:2: iv_ruleType= ruleType EOF
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
    // InternalAsam.g:1613:1: ruleType returns [EObject current=null] : ( ( (lv_Vtypes_0_0= ruleVTypes ) ) | this_ListType_1= ruleListType | this_SetType_2= ruleSetType ) ;
    public final EObject ruleType() throws RecognitionException {
        EObject current = null;

        Enumerator lv_Vtypes_0_0 = null;

        EObject this_ListType_1 = null;

        EObject this_SetType_2 = null;



        	enterRule();

        try {
            // InternalAsam.g:1619:2: ( ( ( (lv_Vtypes_0_0= ruleVTypes ) ) | this_ListType_1= ruleListType | this_SetType_2= ruleSetType ) )
            // InternalAsam.g:1620:2: ( ( (lv_Vtypes_0_0= ruleVTypes ) ) | this_ListType_1= ruleListType | this_SetType_2= ruleSetType )
            {
            // InternalAsam.g:1620:2: ( ( (lv_Vtypes_0_0= ruleVTypes ) ) | this_ListType_1= ruleListType | this_SetType_2= ruleSetType )
            int alt23=3;
            switch ( input.LA(1) ) {
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
                {
                alt23=1;
                }
                break;
            case 51:
                {
                alt23=2;
                }
                break;
            case 53:
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
                    // InternalAsam.g:1621:3: ( (lv_Vtypes_0_0= ruleVTypes ) )
                    {
                    // InternalAsam.g:1621:3: ( (lv_Vtypes_0_0= ruleVTypes ) )
                    // InternalAsam.g:1622:4: (lv_Vtypes_0_0= ruleVTypes )
                    {
                    // InternalAsam.g:1622:4: (lv_Vtypes_0_0= ruleVTypes )
                    // InternalAsam.g:1623:5: lv_Vtypes_0_0= ruleVTypes
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
                    // InternalAsam.g:1641:3: this_ListType_1= ruleListType
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
                    // InternalAsam.g:1650:3: this_SetType_2= ruleSetType
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
    // InternalAsam.g:1662:1: entryRuleRType returns [EObject current=null] : iv_ruleRType= ruleRType EOF ;
    public final EObject entryRuleRType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRType = null;


        try {
            // InternalAsam.g:1662:46: (iv_ruleRType= ruleRType EOF )
            // InternalAsam.g:1663:2: iv_ruleRType= ruleRType EOF
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
    // InternalAsam.g:1669:1: ruleRType returns [EObject current=null] : ( ( (lv_Vypes_0_0= ruleVTypes ) ) | this_ListType_1= ruleListType | this_ID_2= RULE_ID ) ;
    public final EObject ruleRType() throws RecognitionException {
        EObject current = null;

        Token this_ID_2=null;
        Enumerator lv_Vypes_0_0 = null;

        EObject this_ListType_1 = null;



        	enterRule();

        try {
            // InternalAsam.g:1675:2: ( ( ( (lv_Vypes_0_0= ruleVTypes ) ) | this_ListType_1= ruleListType | this_ID_2= RULE_ID ) )
            // InternalAsam.g:1676:2: ( ( (lv_Vypes_0_0= ruleVTypes ) ) | this_ListType_1= ruleListType | this_ID_2= RULE_ID )
            {
            // InternalAsam.g:1676:2: ( ( (lv_Vypes_0_0= ruleVTypes ) ) | this_ListType_1= ruleListType | this_ID_2= RULE_ID )
            int alt24=3;
            switch ( input.LA(1) ) {
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
                {
                alt24=1;
                }
                break;
            case 51:
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
                    // InternalAsam.g:1677:3: ( (lv_Vypes_0_0= ruleVTypes ) )
                    {
                    // InternalAsam.g:1677:3: ( (lv_Vypes_0_0= ruleVTypes ) )
                    // InternalAsam.g:1678:4: (lv_Vypes_0_0= ruleVTypes )
                    {
                    // InternalAsam.g:1678:4: (lv_Vypes_0_0= ruleVTypes )
                    // InternalAsam.g:1679:5: lv_Vypes_0_0= ruleVTypes
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
                    // InternalAsam.g:1697:3: this_ListType_1= ruleListType
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
                    // InternalAsam.g:1706:3: this_ID_2= RULE_ID
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
    // InternalAsam.g:1714:1: entryRuleListType returns [EObject current=null] : iv_ruleListType= ruleListType EOF ;
    public final EObject entryRuleListType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleListType = null;


        try {
            // InternalAsam.g:1714:49: (iv_ruleListType= ruleListType EOF )
            // InternalAsam.g:1715:2: iv_ruleListType= ruleListType EOF
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
    // InternalAsam.g:1721:1: ruleListType returns [EObject current=null] : (otherlv_0= 'List<' ( (lv_type_1_0= ruleType ) ) otherlv_2= '>' ) ;
    public final EObject ruleListType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_type_1_0 = null;



        	enterRule();

        try {
            // InternalAsam.g:1727:2: ( (otherlv_0= 'List<' ( (lv_type_1_0= ruleType ) ) otherlv_2= '>' ) )
            // InternalAsam.g:1728:2: (otherlv_0= 'List<' ( (lv_type_1_0= ruleType ) ) otherlv_2= '>' )
            {
            // InternalAsam.g:1728:2: (otherlv_0= 'List<' ( (lv_type_1_0= ruleType ) ) otherlv_2= '>' )
            // InternalAsam.g:1729:3: otherlv_0= 'List<' ( (lv_type_1_0= ruleType ) ) otherlv_2= '>'
            {
            otherlv_0=(Token)match(input,51,FOLLOW_35); 

            			newLeafNode(otherlv_0, grammarAccess.getListTypeAccess().getListKeyword_0());
            		
            // InternalAsam.g:1733:3: ( (lv_type_1_0= ruleType ) )
            // InternalAsam.g:1734:4: (lv_type_1_0= ruleType )
            {
            // InternalAsam.g:1734:4: (lv_type_1_0= ruleType )
            // InternalAsam.g:1735:5: lv_type_1_0= ruleType
            {

            					newCompositeNode(grammarAccess.getListTypeAccess().getTypeTypeParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_45);
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

            otherlv_2=(Token)match(input,52,FOLLOW_2); 

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
    // InternalAsam.g:1760:1: entryRuleSetType returns [EObject current=null] : iv_ruleSetType= ruleSetType EOF ;
    public final EObject entryRuleSetType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSetType = null;


        try {
            // InternalAsam.g:1760:48: (iv_ruleSetType= ruleSetType EOF )
            // InternalAsam.g:1761:2: iv_ruleSetType= ruleSetType EOF
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
    // InternalAsam.g:1767:1: ruleSetType returns [EObject current=null] : (otherlv_0= 'Set<' ( (lv_type_1_0= ruleType ) ) otherlv_2= '>' ) ;
    public final EObject ruleSetType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_type_1_0 = null;



        	enterRule();

        try {
            // InternalAsam.g:1773:2: ( (otherlv_0= 'Set<' ( (lv_type_1_0= ruleType ) ) otherlv_2= '>' ) )
            // InternalAsam.g:1774:2: (otherlv_0= 'Set<' ( (lv_type_1_0= ruleType ) ) otherlv_2= '>' )
            {
            // InternalAsam.g:1774:2: (otherlv_0= 'Set<' ( (lv_type_1_0= ruleType ) ) otherlv_2= '>' )
            // InternalAsam.g:1775:3: otherlv_0= 'Set<' ( (lv_type_1_0= ruleType ) ) otherlv_2= '>'
            {
            otherlv_0=(Token)match(input,53,FOLLOW_35); 

            			newLeafNode(otherlv_0, grammarAccess.getSetTypeAccess().getSetKeyword_0());
            		
            // InternalAsam.g:1779:3: ( (lv_type_1_0= ruleType ) )
            // InternalAsam.g:1780:4: (lv_type_1_0= ruleType )
            {
            // InternalAsam.g:1780:4: (lv_type_1_0= ruleType )
            // InternalAsam.g:1781:5: lv_type_1_0= ruleType
            {

            					newCompositeNode(grammarAccess.getSetTypeAccess().getTypeTypeParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_45);
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

            otherlv_2=(Token)match(input,52,FOLLOW_2); 

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
    // InternalAsam.g:1806:1: ruleVTypes returns [Enumerator current=null] : ( (enumLiteral_0= 'float' ) | (enumLiteral_1= 'long' ) | (enumLiteral_2= 'int' ) | (enumLiteral_3= 'char' ) | (enumLiteral_4= 'boolean' ) | (enumLiteral_5= 'byte' ) | (enumLiteral_6= 'String' ) ) ;
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
            // InternalAsam.g:1812:2: ( ( (enumLiteral_0= 'float' ) | (enumLiteral_1= 'long' ) | (enumLiteral_2= 'int' ) | (enumLiteral_3= 'char' ) | (enumLiteral_4= 'boolean' ) | (enumLiteral_5= 'byte' ) | (enumLiteral_6= 'String' ) ) )
            // InternalAsam.g:1813:2: ( (enumLiteral_0= 'float' ) | (enumLiteral_1= 'long' ) | (enumLiteral_2= 'int' ) | (enumLiteral_3= 'char' ) | (enumLiteral_4= 'boolean' ) | (enumLiteral_5= 'byte' ) | (enumLiteral_6= 'String' ) )
            {
            // InternalAsam.g:1813:2: ( (enumLiteral_0= 'float' ) | (enumLiteral_1= 'long' ) | (enumLiteral_2= 'int' ) | (enumLiteral_3= 'char' ) | (enumLiteral_4= 'boolean' ) | (enumLiteral_5= 'byte' ) | (enumLiteral_6= 'String' ) )
            int alt25=7;
            switch ( input.LA(1) ) {
            case 54:
                {
                alt25=1;
                }
                break;
            case 55:
                {
                alt25=2;
                }
                break;
            case 56:
                {
                alt25=3;
                }
                break;
            case 57:
                {
                alt25=4;
                }
                break;
            case 58:
                {
                alt25=5;
                }
                break;
            case 59:
                {
                alt25=6;
                }
                break;
            case 60:
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
                    // InternalAsam.g:1814:3: (enumLiteral_0= 'float' )
                    {
                    // InternalAsam.g:1814:3: (enumLiteral_0= 'float' )
                    // InternalAsam.g:1815:4: enumLiteral_0= 'float'
                    {
                    enumLiteral_0=(Token)match(input,54,FOLLOW_2); 

                    				current = grammarAccess.getVTypesAccess().getFLOATEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getVTypesAccess().getFLOATEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalAsam.g:1822:3: (enumLiteral_1= 'long' )
                    {
                    // InternalAsam.g:1822:3: (enumLiteral_1= 'long' )
                    // InternalAsam.g:1823:4: enumLiteral_1= 'long'
                    {
                    enumLiteral_1=(Token)match(input,55,FOLLOW_2); 

                    				current = grammarAccess.getVTypesAccess().getLONGEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getVTypesAccess().getLONGEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalAsam.g:1830:3: (enumLiteral_2= 'int' )
                    {
                    // InternalAsam.g:1830:3: (enumLiteral_2= 'int' )
                    // InternalAsam.g:1831:4: enumLiteral_2= 'int'
                    {
                    enumLiteral_2=(Token)match(input,56,FOLLOW_2); 

                    				current = grammarAccess.getVTypesAccess().getINTEGEREnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getVTypesAccess().getINTEGEREnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalAsam.g:1838:3: (enumLiteral_3= 'char' )
                    {
                    // InternalAsam.g:1838:3: (enumLiteral_3= 'char' )
                    // InternalAsam.g:1839:4: enumLiteral_3= 'char'
                    {
                    enumLiteral_3=(Token)match(input,57,FOLLOW_2); 

                    				current = grammarAccess.getVTypesAccess().getCHAREnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getVTypesAccess().getCHAREnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalAsam.g:1846:3: (enumLiteral_4= 'boolean' )
                    {
                    // InternalAsam.g:1846:3: (enumLiteral_4= 'boolean' )
                    // InternalAsam.g:1847:4: enumLiteral_4= 'boolean'
                    {
                    enumLiteral_4=(Token)match(input,58,FOLLOW_2); 

                    				current = grammarAccess.getVTypesAccess().getBOOLEANEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getVTypesAccess().getBOOLEANEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalAsam.g:1854:3: (enumLiteral_5= 'byte' )
                    {
                    // InternalAsam.g:1854:3: (enumLiteral_5= 'byte' )
                    // InternalAsam.g:1855:4: enumLiteral_5= 'byte'
                    {
                    enumLiteral_5=(Token)match(input,59,FOLLOW_2); 

                    				current = grammarAccess.getVTypesAccess().getBYTEEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getVTypesAccess().getBYTEEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalAsam.g:1862:3: (enumLiteral_6= 'String' )
                    {
                    // InternalAsam.g:1862:3: (enumLiteral_6= 'String' )
                    // InternalAsam.g:1863:4: enumLiteral_6= 'String'
                    {
                    enumLiteral_6=(Token)match(input,60,FOLLOW_2); 

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
    // InternalAsam.g:1873:1: ruleHttpMethods returns [Enumerator current=null] : ( (enumLiteral_0= 'Get' ) | (enumLiteral_1= 'Delete' ) | (enumLiteral_2= 'Post' ) | (enumLiteral_3= 'Put' ) | (enumLiteral_4= 'Patch' ) ) ;
    public final Enumerator ruleHttpMethods() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;


        	enterRule();

        try {
            // InternalAsam.g:1879:2: ( ( (enumLiteral_0= 'Get' ) | (enumLiteral_1= 'Delete' ) | (enumLiteral_2= 'Post' ) | (enumLiteral_3= 'Put' ) | (enumLiteral_4= 'Patch' ) ) )
            // InternalAsam.g:1880:2: ( (enumLiteral_0= 'Get' ) | (enumLiteral_1= 'Delete' ) | (enumLiteral_2= 'Post' ) | (enumLiteral_3= 'Put' ) | (enumLiteral_4= 'Patch' ) )
            {
            // InternalAsam.g:1880:2: ( (enumLiteral_0= 'Get' ) | (enumLiteral_1= 'Delete' ) | (enumLiteral_2= 'Post' ) | (enumLiteral_3= 'Put' ) | (enumLiteral_4= 'Patch' ) )
            int alt26=5;
            switch ( input.LA(1) ) {
            case 61:
                {
                alt26=1;
                }
                break;
            case 62:
                {
                alt26=2;
                }
                break;
            case 63:
                {
                alt26=3;
                }
                break;
            case 64:
                {
                alt26=4;
                }
                break;
            case 65:
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
                    // InternalAsam.g:1881:3: (enumLiteral_0= 'Get' )
                    {
                    // InternalAsam.g:1881:3: (enumLiteral_0= 'Get' )
                    // InternalAsam.g:1882:4: enumLiteral_0= 'Get'
                    {
                    enumLiteral_0=(Token)match(input,61,FOLLOW_2); 

                    				current = grammarAccess.getHttpMethodsAccess().getGETEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getHttpMethodsAccess().getGETEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalAsam.g:1889:3: (enumLiteral_1= 'Delete' )
                    {
                    // InternalAsam.g:1889:3: (enumLiteral_1= 'Delete' )
                    // InternalAsam.g:1890:4: enumLiteral_1= 'Delete'
                    {
                    enumLiteral_1=(Token)match(input,62,FOLLOW_2); 

                    				current = grammarAccess.getHttpMethodsAccess().getDELETEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getHttpMethodsAccess().getDELETEEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalAsam.g:1897:3: (enumLiteral_2= 'Post' )
                    {
                    // InternalAsam.g:1897:3: (enumLiteral_2= 'Post' )
                    // InternalAsam.g:1898:4: enumLiteral_2= 'Post'
                    {
                    enumLiteral_2=(Token)match(input,63,FOLLOW_2); 

                    				current = grammarAccess.getHttpMethodsAccess().getPOSTEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getHttpMethodsAccess().getPOSTEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalAsam.g:1905:3: (enumLiteral_3= 'Put' )
                    {
                    // InternalAsam.g:1905:3: (enumLiteral_3= 'Put' )
                    // InternalAsam.g:1906:4: enumLiteral_3= 'Put'
                    {
                    enumLiteral_3=(Token)match(input,64,FOLLOW_2); 

                    				current = grammarAccess.getHttpMethodsAccess().getPUTEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getHttpMethodsAccess().getPUTEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalAsam.g:1913:3: (enumLiteral_4= 'Patch' )
                    {
                    // InternalAsam.g:1913:3: (enumLiteral_4= 'Patch' )
                    // InternalAsam.g:1914:4: enumLiteral_4= 'Patch'
                    {
                    enumLiteral_4=(Token)match(input,65,FOLLOW_2); 

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
    // InternalAsam.g:1924:1: ruleRDBMS returns [Enumerator current=null] : ( (enumLiteral_0= 'Mysql' ) | (enumLiteral_1= 'Postgres' ) | (enumLiteral_2= 'Mariadb' ) | (enumLiteral_3= 'h2' ) | (enumLiteral_4= 'Oracle' ) ) ;
    public final Enumerator ruleRDBMS() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;


        	enterRule();

        try {
            // InternalAsam.g:1930:2: ( ( (enumLiteral_0= 'Mysql' ) | (enumLiteral_1= 'Postgres' ) | (enumLiteral_2= 'Mariadb' ) | (enumLiteral_3= 'h2' ) | (enumLiteral_4= 'Oracle' ) ) )
            // InternalAsam.g:1931:2: ( (enumLiteral_0= 'Mysql' ) | (enumLiteral_1= 'Postgres' ) | (enumLiteral_2= 'Mariadb' ) | (enumLiteral_3= 'h2' ) | (enumLiteral_4= 'Oracle' ) )
            {
            // InternalAsam.g:1931:2: ( (enumLiteral_0= 'Mysql' ) | (enumLiteral_1= 'Postgres' ) | (enumLiteral_2= 'Mariadb' ) | (enumLiteral_3= 'h2' ) | (enumLiteral_4= 'Oracle' ) )
            int alt27=5;
            switch ( input.LA(1) ) {
            case 66:
                {
                alt27=1;
                }
                break;
            case 67:
                {
                alt27=2;
                }
                break;
            case 68:
                {
                alt27=3;
                }
                break;
            case 69:
                {
                alt27=4;
                }
                break;
            case 70:
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
                    // InternalAsam.g:1932:3: (enumLiteral_0= 'Mysql' )
                    {
                    // InternalAsam.g:1932:3: (enumLiteral_0= 'Mysql' )
                    // InternalAsam.g:1933:4: enumLiteral_0= 'Mysql'
                    {
                    enumLiteral_0=(Token)match(input,66,FOLLOW_2); 

                    				current = grammarAccess.getRDBMSAccess().getMYSQLEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getRDBMSAccess().getMYSQLEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalAsam.g:1940:3: (enumLiteral_1= 'Postgres' )
                    {
                    // InternalAsam.g:1940:3: (enumLiteral_1= 'Postgres' )
                    // InternalAsam.g:1941:4: enumLiteral_1= 'Postgres'
                    {
                    enumLiteral_1=(Token)match(input,67,FOLLOW_2); 

                    				current = grammarAccess.getRDBMSAccess().getPOSTGRESEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getRDBMSAccess().getPOSTGRESEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalAsam.g:1948:3: (enumLiteral_2= 'Mariadb' )
                    {
                    // InternalAsam.g:1948:3: (enumLiteral_2= 'Mariadb' )
                    // InternalAsam.g:1949:4: enumLiteral_2= 'Mariadb'
                    {
                    enumLiteral_2=(Token)match(input,68,FOLLOW_2); 

                    				current = grammarAccess.getRDBMSAccess().getMARIADBEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getRDBMSAccess().getMARIADBEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalAsam.g:1956:3: (enumLiteral_3= 'h2' )
                    {
                    // InternalAsam.g:1956:3: (enumLiteral_3= 'h2' )
                    // InternalAsam.g:1957:4: enumLiteral_3= 'h2'
                    {
                    enumLiteral_3=(Token)match(input,69,FOLLOW_2); 

                    				current = grammarAccess.getRDBMSAccess().getH2EnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getRDBMSAccess().getH2EnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalAsam.g:1964:3: (enumLiteral_4= 'Oracle' )
                    {
                    // InternalAsam.g:1964:3: (enumLiteral_4= 'Oracle' )
                    // InternalAsam.g:1965:4: enumLiteral_4= 'Oracle'
                    {
                    enumLiteral_4=(Token)match(input,70,FOLLOW_2); 

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

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x000000015A002002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x000000015A000002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000098000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000088000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000068000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000048000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000000L,0x000000000000007CL});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000004004000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000008010L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000008000008000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0xE000000000008080L,0x0000000000000003L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0xE000000000008000L,0x0000000000000003L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000006400008000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x1FC8000000000010L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x00000E0000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x1FE8000000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x00000C0000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000200000000010L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0001000000008010L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0004000000000002L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0010000000000000L});

}