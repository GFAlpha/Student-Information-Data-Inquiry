-- 创建数据库
CREATE DATABASE IF NOT EXISTS studentdb CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci;

-- 选择使用的数据库
USE studentdb;

-- 创建学生表
CREATE TABLE IF NOT EXISTS students (
    id BIGINT(20) PRIMARY KEY AUTO_INCREMENT, -- 学号
    name VARCHAR(100) NOT NULL,               -- 姓名
    class_name VARCHAR(100) NOT NULL          -- 班级名称
);

-- 插入一些示例数据
INSERT INTO students (id, name, class_name) VALUES ('1', '张三', '一年级A班');
INSERT INTO students (id, name, class_name) VALUES ('2', '李四', '二年级B班');
INSERT INTO students (id, name, class_name) VALUES ('3', '王五', '三年级C班');