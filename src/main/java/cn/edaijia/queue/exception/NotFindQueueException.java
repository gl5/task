package cn.edaijia.queue.exception;

/**
 * @author WangJun <wangjuntytl@163.com>
 * @version 1.0 15/5/15
 * @since 1.6
 */

public class NotFindQueueException extends RuntimeException {

    public NotFindQueueException(String queueName) {
        super("not find queue name is " + queueName);
    }
}