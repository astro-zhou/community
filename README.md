# 基于SpringBoot的程序员交流平台设计与实现

跃迁-一个程序员交流成长的平台

# 技术选型
- 构建系统: Maven
- 后台框架: SpringBoot 全家桶
- 数据库: MySQL 8.0

# 开发
## 启动 Tomcat
```shell
cd /Users/mac/Library/tomcat8/bin
```
```shell
./startup.sh
```
## 启动 Zookeeper：(窗口1)
```shell
cd ~/work/kafka_2.12-3.3.1
```
```shell
bin/zookeeper-server-start.sh config/zookeeper.properties
```
## 启动 Kafka：(窗口2)
```shell
cd ~/work/kafka_2.12-3.3.1
```
```shell
bin/kafka-server-start.sh config/server.properties
```
## 启动 Elasticsearch 及相关操作
1. 启动：点击 `/Users/mac/work/elasticsearch-7.7.0/bin` 目录下 `elasticsearch`
2. 查看 es 集群的健康状况：`curl -X GET "localhost:9200/_cat/health?v"`
3. 查看集群中的节点：`curl -X GET "localhost:9200/_cat/nodes?v"`
4. 查看当前 es 服务器的索引：`curl -X GET "localhost:9200/_cat/indices?v"`
5. 创建索引(名为test)：`curl -X PUT "localhost:9200/test"`
6. 删除索引(名为test)：`curl -X  DELETE "localhost:9200/test"`
