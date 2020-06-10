package com.cw.stu.springboot.redis.model;

import java.io.Serializable;
import java.util.Date;

/**
 * @author WuLiangzhi  2019/06/14 17:28
 */
public class User implements Serializable {

    private Long id;
    private String userName;
    private String passWord;
    private String email;
    private String nickName;
    private Date regTime;

    public User(){

    }

    public User(String userName,
                String passWord,
                String email,
                String nickName,
                Date regTime) {
        this.userName = userName;
        this.passWord = passWord;
        this.email = email;
        this.nickName = nickName;
        this.regTime = regTime;
    }

    /**
     * 获取 id 属性
     *
     * @return the value of id
     */
    public Long getId() {
        return id;
    }

    /**
     * 设置 id 属性
     *
     * @param id id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取 userName 属性
     *
     * @return the value of userName
     */
    public String getUserName() {
        return userName;
    }

    /**
     * 设置 userName 属性
     *
     * @param userName userName
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * 获取 passWord 属性
     *
     * @return the value of passWord
     */
    public String getPassWord() {
        return passWord;
    }

    /**
     * 设置 passWord 属性
     *
     * @param passWord passWord
     */
    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    /**
     * 获取 email 属性
     *
     * @return the value of email
     */
    public String getEmail() {
        return email;
    }

    /**
     * 设置 email 属性
     *
     * @param email email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * 获取 nickName 属性
     *
     * @return the value of nickName
     */
    public String getNickName() {
        return nickName;
    }

    /**
     * 设置 nickName 属性
     *
     * @param nickName nickName
     */
    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    /**
     * 获取 regTime 属性
     *
     * @return the value of regTime
     */
    public Date getRegTime() {
        return regTime;
    }

    /**
     * 设置 regTime 属性
     *
     * @param regTime regTime
     */
    public void setRegTime(Date regTime) {
        this.regTime = regTime;
    }
}
