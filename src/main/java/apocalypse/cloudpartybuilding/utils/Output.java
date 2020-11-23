package apocalypse.cloudpartybuilding.utils;


import java.io.Serializable;

/**
 *
 */
public class Output implements Serializable {
    //serialVersionUID 这个是序列化时要用到的,idea可以自动生成,
    /*
    默认情况下Intellij IDEA不会提示继承了Serializable接口的类生成serialVersionUID的警告。
    如果需要生成serialVersionUID，就要在Preferences里面进行设置。
    Preferences -> Inspections -> Serialization issues -> Serialization class without 'serialVersionUID' 打上勾
    */
    private static final long serialVersionUID = -8851744194895903854L;
    //状态码，比如这里定义status默认200，代表接口调用成功。代表网络上的成功而已。
    private int status = 200;
    //code有的人会写成errorCode，是“错误代码”的意思。这是代表业务逻辑上的成功与否‘
    //默认0，代表你的业务逻辑没问题，此次调用成功了。打个比方，你调用接口进行一个“新增”操作，
    //新增成功返回一个code=0代表你此次新增成功了。否则你返回一个code=201(或者其他随便什么
    //只要你喜欢)代表新增失败。
    private int code = 0;
    //错误信息，比如“新增失败！”等
    private String message;
    //如果新增成功，就把你想要抛出去的东西放在result里面跑出去。result用Object定义。随便你
    //放什么进去都OK ,String、int、List...  whatever you want
    private Object result;

    public int getStatus() {
        return this.status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getCode() {
        return this.code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return this.message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getResult() {
        return this.result;
    }

    public void setResult(Object result) {
        this.result = result;
    }

    public Output() {
    }

    public Output(Object result) {
        this.result = result;
    }

    public Output(int code, String message) {
        this.code = code;
        this.message = message;
    }
}

