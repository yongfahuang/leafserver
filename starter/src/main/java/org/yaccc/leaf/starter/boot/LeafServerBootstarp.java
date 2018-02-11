package org.yaccc.leaf.starter.boot;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by xiezhaodong  on 2018/2/11
 */
@Slf4j
@SpringBootApplication(scanBasePackages = {"org.yaccc.leaf.*"})
public class LeafServerBootstarp {

    public static void main(String[] args) {
        try {
            log.info("Initializing leafserver...");
            SpringApplication.run(LeafServerBootstarp.class, args);
        } catch (Exception e) {
            log.error("start leafserver error {}",e);
            System.exit(0);
        }finally {
           String leaf= "　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　\n" +
                    "　　　　　◆◆　　　　　　　　　　　　　◆◆◆◆◆　　　　　　　　　　　  ◆◆◆　　　　　　　　　　 ◆◆◆◆◆　　　　　\n" +
                    "　　　　　◆◆　　　　　　　　　　　　　◆◆　　　　　　　　　　　　　　◆◆◆　　　　　　　　　　 ◆◆　　　　　　　　\n" +
                    "　　　　　◆◆　　　　　　　　　　　　　◆◆　　　　　　　　　　　　　　◆◆◆◆　　　　　　　　　　◆◆　　　　　　　　\n" +
                    "　　　　　◆◆　　　　　　　　　　　　　◆◆　　　　　　　　　　　　　◆◆　◆◆　　　　　　　　　　◆◆　　　　　　　　\n" +
                    "　　　　　◆◆　　　　　　　　　　　　　◆◆◆◆◆　　　　　　　　　　  ◆◆　◆◆　　　　　　　　　　◆◆◆◆◆　　　　　\n" +
                    "　　　　　◆◆　　　　　　　　　　　　　◆◆　　　　　　　　　　　　　◆◆　◆◆◆　　　　　　　　　 ◆◆　　　　　　　　\n" +
                    "　　　　　◆◆　　　　　　　　　　　　　◆◆　　　　　　　　　　　　◆◆◆◆◆◆◆◆　　　　　　　　　 ◆◆　　　　　　　　\n" +
                    "　　　　　◆◆　　　　　　　　　　　　　◆◆　　　　　　　　　　　　◆◆　　　◆◆　　　　　　　　　◆◆　　　　　　　　\n" +
                    "　　　　　◆◆　　　　　　　　　　　　　◆◆　　　　　　　　　　　　◆◆　　　◆◆　　　　　　　　　◆◆　　　　　　　　\n" +
                    "　　　　　◆◆◆◆◆◆　　　　　　　　　   ◆◆◆◆◆　　　　　　　　　  ◆◆　　　◆◆◆　　　　　　　　 ◆◆　　";
            log.info(leaf);
            log.info("Started leafserver , enjoy it!!");
        }
    }

}
