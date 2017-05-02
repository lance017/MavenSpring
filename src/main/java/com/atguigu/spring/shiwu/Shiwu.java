package com.atguigu.spring.shiwu;

import org.junit.Test;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by lance017 on 2017/5/2.
 */
public class Shiwu {

    private int s = 0;

    @Test

    public void test(){
        System.out.println("test1--->" + s);
        add();
        System.out.println("test2--->" + s);
    }

    /**
     * propagation: 事务的传播属性,一个事务方法被另一个事务方法调用时,需要指定事务如何传播
     * 就是哪一个管用
     *
     * Propagation.REQUIRED：如果当前存在事务，则加入该事务；如果当前没有事务，则创建一个新的事务。
     * Propagation.REQUIRES_NEW：创建一个新的事务，如果当前存在事务，则把当前事务挂起。
     * Propagation.SUPPORTS：如果当前存在事务，则加入该事务；如果当前没有事务，则以非事务的方式继续运行。
     * Propagation.NOT_SUPPORTED：以非事务方式运行，如果当前存在事务，则把当前事务挂起。
     * Propagation.NEVER：以非事务方式运行，如果当前存在事务，则抛出异常。
     * Propagation.MANDATORY：如果当前存在事务，则加入该事务；如果当前没有事务，则抛出异常。
     * Propagation.NESTED：如果当前存在事务，则创建一个事务作为当前事务的嵌套事务来运行；如果当前没有事务，则该取值等价于Propagation.REQUIRED。
     */

    /**
     * isolation: 隔离级别
     * Isolation.DEFAULT：这是默认值，表示使用底层数据库的默认隔离级别。对大部分数据库而言，通常这值就是Isolation.READ_COMMITTED。
     * Isolation.READ_UNCOMMITTED：该隔离级别表示一个事务可以读取另一个事务修改但还没有提交的数据。该级别不能防止脏读和不可重复读，因此很少使用该隔离级别。
     * Isolation.READ_COMMITTED：该隔离级别表示一个事务只能读取另一个事务已经提交的数据。该级别可以防止脏读，这也是大多数情况下的推荐值。
     * Isolation.REPEATABLE_READ：该隔离级别表示一个事务在整个过程中可以多次重复执行某个查询，并且每次返回的记录都相同。即使在多次查询之间有新增的数据满足该查询，这些新增的记录也会被忽略。该级别可以防止脏读和不可重复读。
     * Isolation.SERIALIZABLE：所有的事务依次逐个执行，这样事务之间就完全不可能产生干扰，也就是说，该级别可以防止脏读、不可重复读以及幻读。但是这将严重影响程序的性能。通常情况下也不会用到该级别。
     */

    /**
     * rollbackFor:定义不回滚的异常
     */

    /**
     * readOnly:指定事务是否为只读，优化数据库引擎优化事务
     */

    /**
     * timeout:使用timeout指定占用时间，大于时强制回滚。
     */
    @Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.DEFAULT, rollbackFor = {ShiwuException.class}, readOnly = true, timeout = 1)
    public void add() {
        s = s + 1;
        System.out.println("add--->" + s);
        if (s == 1) {
            throw new ShiwuException("s不能为1");
        }
    }
}
