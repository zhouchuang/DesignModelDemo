package Bridge;

public class Start {
    public static void main(String[] args) {
        Huawei huawei = new Huawei();
        Iphone iphone = new Iphone();
        Alipay alipay = new Alipay();
        Wechat wechat = new Wechat();
        huawei.install(alipay);
        huawei.install(wechat);
        iphone.install(alipay);
        huawei.run(alipay);
        huawei.run(wechat);
        iphone.run(alipay);
        iphone.run(wechat);
    }
}
