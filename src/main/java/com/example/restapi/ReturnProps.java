package com.example.restapi;

public class ReturnProps {
    private String message;
    private String status;

    public ReturnProps(String message, String status){
        this.message = message;
        this.status = status;
    }
    public String getMessage(){
        return message;
    }
    public String getStatus(){
        return status;
    }
    public void setMessage(String message){
        this.message = message;
    }
    public void setStatus(String status){
        this.status = status;
    }
    @Override
    public String toString(){
        return " MessageProps{"+
                "message="+ message +
                ", status="+ status +"}";
    }
}
