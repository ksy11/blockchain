package org.web3jtest;

import org.junit.BeforeClass;
import org.junit.Test;
import org.web3j.protocol.Web3j;
import org.web3j.protocol.admin.Admin;
import org.web3j.protocol.http.HttpService;
import org.web3j.protocol.parity.Parity;

/**
 * @author zacconding
 * @Date 2018-05-01
 * @GitHub : https://github.com/zacscoding
 */

// @RunWith(SpringRunner.class)
// @SpringBootTest
public class AbstractTestRunner {
    public static Web3j web3j;
    public static Admin admin;
    public static Parity parity;

    @BeforeClass
    public static void setUp() {
        // web3j = Web3j.build(new HttpService("http://192.168.79.128:8540"));
        // web3j = Web3j.build(new HttpService("http://192.168.5.15:8540"));
        // HttpService httpService = new HttpService("http://192.168.5.50:8540");
        // HttpService httpService = new HttpService("http://192.168.5.50:8543");
        // HttpService httpService = new HttpService("http://192.168.79.128:8540");
        // HttpService httpService = new HttpService("http://192.168.5.77:8540");
        HttpService httpService = new HttpService("http://192.168.5.78:1234");

        web3j = Web3j.build(httpService);
        admin = Admin.build(httpService);
        parity = Parity.build(httpService);
    }

    @Test
    public void contextLoad() throws Exception {
        System.out.println(web3j.web3ClientVersion().send().getWeb3ClientVersion());
    }

    @Test
    public void sample() {

    }
}
