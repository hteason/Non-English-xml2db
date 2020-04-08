package pers.htc.chinesexml2db.bean;

import bean.Importable;
import handler.anno.IntValueMap;
import handler.anno.NodeName;
import handler.anno.XMLAttr;
import lombok.Data;

import java.util.UUID;

@Data
@NodeName("家庭成员")
public class Family implements Importable {
    private String id = UUID.randomUUID().toString();
    @XMLAttr("学生ID")
    private String studentId;
    @XMLAttr("关系")
    @IntValueMap({"父亲=1","母亲=2","爷爷=3","奶奶=4"})
    private Integer relation;
    @XMLAttr("姓名")
    private String name;
    @XMLAttr("年龄")
    private Integer age;
}
