# nacos-config 配置本地优先测试

## 基础配置
- 程序运行参数 -Ddev.name=vmparam
- bootstrap.yml 配置 dev.name=bootstrap.yml
- application.yml 配置 dev.name=application.yml
- nacos 测试配置
  - nacos 配置dataid:test  格式Properties
  - nacos 配置dataid:test.properties  格式Properties
  - nacos 配置dataid:test  格式yaml,开启 bootstrap 中 file-extension: yaml
  - nacos 配置dataid:test.yaml  格式yaml,开启 bootstrap 中 file-extension: yaml

## 结论？？？
1. 只要nacos配置命中，则nacos中dev.name生效。
2. nacos不命中，则vm参数优先。
期望：nacos命中，可以vm 或者本地配置优先

## 参考
### Nacos config
dataId:test
格式:properties
内容：dev.name=nacosproperties

### bootstrap.yml
```yml

spring:
  application:
    name: test
  cloud:
    nacos:
      config:
        server-addr: 127.0.0.1:8848
#        file-extension: yaml
dev:
  name: bootstrap
```
### application.yml
```yml
dev:
  name: application.yml
```