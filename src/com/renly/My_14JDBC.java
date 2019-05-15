package com.renly;

import java.sql.*;

/**
 * @author ${任岚杨}
 * @title: My_14JDBC
 * @projectName workspace_renly
 * @description: Java 数据库连接，（Java Database Connectivity，简称JDBC）
 * 是Java语言中用来规范客户端程序如何来访问数据库的应用程序接口，提供了诸如查询和更新数据库中数据的方法。
 * JDBC也是Sun Microsystems的商标。它JDBC是面向关系型数据库的。
 * @date 2019/4/29 16:33
 *
 *
 * 步骤：
 * (1)创建Connection对象、SQL查询命令字符串；
 * (2)对Connection对象传入SQL查询命令，获得PreparedStatement对象；
 * (3)对PreparedStatement对象执行executeUpdate()或executeQurey()获得结果；
 * (4)先后关闭PreparedStatement对象和Connection对象。
 *
 */
public class My_14JDBC {
    // 第一步：定义数据驱动名称和url路径
    static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost/myjavasql?useUnicode=true&characterEncoding=UTF-8&serverTimezone=UTC";

    // 第二步：定义数据库用户名和密码
    static final String USER = "root";
    static final String PASS = "zxcvbnm2019";


    /**
     *数据库操作
     * @return
     */
    private static Connection getConn() {
        Connection conn = null;
        try {
            //第三步：注册驱动
            Class.forName(JDBC_DRIVER);

            //第四步：连接数据库，得到Connection对象
            System.out.println( "正在连接数据库..." );
            conn = (Connection) DriverManager.getConnection(DB_URL, USER, PASS);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return conn;
    }



    /**
     *
     * 增加数据库数据
     */
    private static int insert(Person person) {
        Connection conn = getConn();
        int i = 0;
        String sql = "insert into my_test (Name) values(?)";
        PreparedStatement pstmt;
        try {
            pstmt = (PreparedStatement) conn.prepareStatement(sql);
            pstmt.setString(1, person.getName());
            i = pstmt.executeUpdate();
            pstmt.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return i;
    }


    /**
     * 删除数据库数据
     * @param name
     * @return
     */
    /*private static int delete(String name) {
        Connection conn = getConn();
        int i = 0;
        String sql = "delete from my_test where name='" + name + "'";
        PreparedStatement pstmt;
        try {
            pstmt = (PreparedStatement) conn.prepareStatement(sql);
            i = pstmt.executeUpdate();
            System.out.println("resutl: " + i);
            pstmt.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return i;
    }*/

    /**
     * 查询数据库数据
     * @return
     */
   /* private static Integer getAll() {
        Connection conn = getConn();
        String sql = "select * from my_test";
        PreparedStatement pstmt;
        try {
            pstmt = (PreparedStatement)conn.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();
            int col = rs.getMetaData().getColumnCount();
            System.out.println("============================");
            while (rs.next()){
                for (int i = 1; i <=col; i++) {
                    System.out.print(rs.getString( i )+"\t");
                }
                System.out.println("");
            }
            System.out.println("============================");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }*/

    /**
     * 修改数据库数据
     * @param person
     * @return
     */
    private static int update(Person person) {
        Connection conn = getConn();
        int i = 0;
        String sql = "update my_test set name='" + person.getName() + "' where id='" + person.getId() + "'";
        PreparedStatement pstmt;
        try {
            pstmt = (PreparedStatement) conn.prepareStatement(sql);
            i = pstmt.executeUpdate();
            System.out.println("resutl: " + i);
            pstmt.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return i;
    }

    public static void main(String[] args) {
//        Person person =new Person();
//        person.setName( "张飞" );
//        insert( person );
//        delete( "张飞" );
//        getAll();
          Person person = new Person();
          person.setId( 1 );
          person.setName( "曹操" );
          update( person );

    }


}
