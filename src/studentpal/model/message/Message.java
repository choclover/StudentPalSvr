package studentpal.model.message;

import java.util.HashMap;

public class Message {
  private static final String TAG = "Model.Message";

  public static final String MESSAGE_HEADER_ACK     = "A";
  public static final String MESSAGE_HEADER_REQ     = "R";
  public static final String MESSAGE_HEADER_NOTIF   = "N";
  
  public static final String TAGNAME_MSG_TYPE   = "msg_type";
  public static final String TAGNAME_MSG_ID     = "msg_id";
  public static final String TAGNAME_CMD_TYPE   = "cmd_type";
  public static final String TAGNAME_ERR_CODE   = "err_code";
  public static final String TAGNAME_ERR_DESC   = "err_desc";
  public static final String TAGNAME_RESULT     = "result";
  public static final String TAGNAME_ARGUMENTS  = "args";

  public static final String TAGNAME_PHONE_NUM         = "phone_no";
  public static final String TAGNAME_PHONE_IMSI        = "phone_imsi";
  public static final String TAGNAME_PHONE_IMEI        = "phone_imei";
  public static final String TAGNAME_APPLICATIONS      = "applications";
  public static final String TAGNAME_APP               = "application";
  public static final String TAGNAME_APP_NAME          = "app_name";
  public static final String TAGNAME_APP_CLASSNAME     = "app_classname";
  public static final String TAGNAME_APP_PKGNAME       = "app_pkgname";
  
  public static final String TAGNAME_ACCESS_CATEGORIES = "access_categories";
  public static final String TAGNAME_ACCESS_CATEGORY   = "access_cate";
  public static final String TAGNAME_ACCESS_CATE_ID    = "cate_id";
  public static final String TAGNAME_ACCESS_CATE_NAME  = "cate_name";
  
  public static final String TAGNAME_ACCESS_RULES      = "access_rules";
  public static final String TAGNAME_ACCESS_RULE       = "access_rule";
  public static final String TAGNAME_RULE_AUTH_TYPE    = "auth_type";
  public static final String TAGNAME_RULE_REPEAT_TYPE  = "repeat_type";
  public static final String TAGNAME_RULE_REPEAT_VALUE = "repeat_value";
  public static final String TAGNAME_ACCESS_TIMERANGES = "time_ranges";
  public static final String TAGNAME_ACCESS_TIMERANGE  = "time_range";
  public static final String TAGNAME_RULE_REPEAT_STARTTIME  = "start_time";
  public static final String TAGNAME_RULE_REPEAT_ENDTIME    = "end_time";
  
  /*
   * TASK constants
   */
  public static final String TASKNAME_Generic     = "Generic";
  public static final String TASKNAME_GetAppList  = "GetAppList";
  public static final String TASKNAME_SetAppAccessCategory = "SetAppAccessCategory";
  //public static final String TASKNAME_SetAccessCategories  = "SetAccessCategories";
  /* Tasks from Phone */
  public static final String TASKNAME_LOGIN   = "LOGIN";
  public static final String TASKNAME_LOGOUT  = "LOGOUT";
  
  /*
   * Error code constants 
   */
  public static final int ERRCODE_NOERROR                   = 0;
  public static final int ERRCODE_TIMEOUT                   = 100;
  public static final int ERRCODE_CLIENT_CONN_LOST          = 200;
  public static final int ERRCODE_SERVER_CONN_LOST          = 300;
  public static final int ERRCODE_MSG_FORMAT_ERR            = 400;
  public static final int ERRCODE_RESP_MSG_FORMAT_ERR       = 401;
  public static final int ERRCODE_SERVER_INTERNAL_ERR       = 500;

  /*
   * Value constants
   */
  public static final int MSG_ID_INVALID = -1;
  public static final int MSG_ID_NOTUSED = 0;

  public static final int RECUR_TYPE_DAILY    = 0x01;
  public static final int RECUR_TYPE_WEEKLY   = 0x02;
  public static final int RECUR_TYPE_MONTHLY  = 0x03;
  public static final int RECUR_TYPE_YEARLY   = 0x04;
  public static final String TXT_RECUR_TYPE_DAILY    = "daily";
  public static final String TXT_RECUR_TYPE_WEEKLY   = "weekly";
  public static final String TXT_RECUR_TYPE_MONTHLY  = "monthly";
  public static final String TXT_RECUR_TYPE_YEARLY   = "yearly";
  
  public static final int ACCESS_TYPE_DENIED    = 0x01;
  public static final int ACCESS_TYPE_PERMITTED = 0x02;
  public static final String TXT_ACCESS_TYPE_DENIED    = "access_denied";
  public static final String TXT_ACCESS_TYPE_PERMITTED = "access_permitted";
  
  public static final int SIGNAL_TYPE_REQACK                     = 101;
  public static final int SIGNAL_TYPE_OUTSTREAM_READY            = 110;
  public static final int SIGNAL_SHOW_ACCESS_DENIED_NOTIFICATION = 111;
  public static final int SIGNAL_ACCESS_RESCHEDULE_DAILY         = 112;
  
  
  private static final HashMap<Integer, String> ERRCODE_DESC_MAPPER 
    = new HashMap<Integer, String>();
  // static {
  // ERRCODE_DESC_MAPPER.put(ERRCODE_NOERROR, "SUCCESS");
  // }
  
  /*
   * Member fields
   */
  private int type = 0;
  private int errcoe = 0;
  private Object data = null;
  
  //////////////////////////////////////////////////////////////////////////////
  public void setData(int type, int code, Object data) {
    this.type = type;
    this.errcoe = code;
    this.data = data;
  }

  public int getType() {
    return this.type;
  }

  public int getCode() {
    return this.errcoe;
  }

  public Object getData() {
    return this.data;
  }
  

}
