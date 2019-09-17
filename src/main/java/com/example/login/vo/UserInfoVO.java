package com.example.login.vo;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class UserInfoVO {

	/** ID */
	private int id;
	/** 用户名 */
	private String userName;
	/** 手机号 */
	private String userTel;
	/** 密码 */
	private String userPassword;
	/** 身份证号码 */
	private String userIdNumber;
	/** 地址 */
	private String userAddress;
	/** 注册时间 */
	private Date userRegisterDate;
	/** 是否在线0下线1在线 */
	private String userOnlineState;
	/** 是否实名0未实名1实名 */
	private String userRealName;
	/** 身份证正面照 */
	private String userIdCardFront;
	/** 注册时间 */
	private String userIdCardReverse;
	/** 注册时间 */
	private String userIdCardRunholder;
}
