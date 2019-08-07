package com.xian.common;

/**
 * @ Author     ：mmzs.
 * @ Date       ：Created in 下午6:23 2019/5/28
 * @ Description：${description}
 * @ Modified By：
 * @Version: $version$
 */
public class ReturnType {
  private int errorCode;
  private String errorDesc;

  public int getErrorCode() {
    return errorCode;
  }

  public String getErrorDesc() {
    return errorDesc;
  }

  public void setErrorCode( int errorCode ) {
    this.errorCode = errorCode;
  }

  public void setErrorDesc( String errorDesc ) {
    this.errorDesc = errorDesc;
  }
}
