package cn.iocoder.mall.payservice.service.transaction.impl;

import cn.iocoder.mall.payservice.dal.mysql.mapper.transaction.PayTransactionMapper;
import cn.iocoder.mall.payservice.service.transaction.PayTransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

/**
* 支付交易单 Service 实现类
*/
@Service
@Validated
public class PayTransactionServiceImpl implements PayTransactionService {

    @Autowired
    private PayTransactionMapper transactionMapper;



//    /**
//    * 创建pay_transaction
//    *
//    * @param createBO 创建pay_transaction BO
//    * @return pay_transaction
//    */
//    public TransactionBO createTransaction(@Valid TransactionCreateBO createBO) {
//        // 插入到数据库
//        PayTransactionDO transactionDO = TransactionConvert.INSTANCE.convert(createBO);
//        transactionMapper.insert(transactionDO);
//        // 返回
//        return TransactionConvert.INSTANCE.convert(transactionDO);
//    }
//
//    /**
//    * 更新pay_transaction
//    *
//    * @param updateBO 更新pay_transaction BO
//    */
//    public void updateTransaction(@Valid TransactionUpdateBO updateBO) {
//        // 校验更新的pay_transaction是否存在
//        if (transactionMapper.selectById(updateBO.getId()) == null) {
//            throw ServiceExceptionUtil.exception(AuthErrorCodeConstants.TRANSACTION_NOT_FOUND);
//        }
//        // 更新到数据库
//        PayTransactionDO updateObject = TransactionConvert.INSTANCE.convert(updateBO);
//        transactionMapper.updateById(updateObject);
//    }
//
//    /**
//    * 删除pay_transaction
//    *
//    * @param transactionId pay_transaction编号
//    */
//    public void deleteTransaction(Integer transactionId) {
//        // 校验删除的pay_transaction是否存在
//        if (transactionMapper.selectById(transactionId) == null) {
//            throw ServiceExceptionHelper.exception(AuthErrorCodeConstants.TRANSACTION_NOT_FOUND);
//        }
//        // 标记删除
//        transactionMapper.deleteById(transactionId);
//    }
//
//    /**
//    * 获得pay_transaction
//    *
//    * @param transactionId pay_transaction编号
//    * @return pay_transaction
//    */
//    public TransactionBO getTransaction(Integer transactionId) {
//        PayTransactionDO transactionDO = transactionMapper.selectById(transactionId);
//        return TransactionConvert.INSTANCE.convert(transactionDO);
//    }
//
//    /**
//    * 获得pay_transaction列表
//    *
//    * @param transactionIds pay_transaction编号列表
//    * @return pay_transaction列表
//    */
//    public List<TransactionBO> listTransactions(List<Integer> transactionIds) {
//        List<PayTransactionDO> transactionDOs = transactionMapper.selectBatchIds(transactionIds);
//        return TransactionConvert.INSTANCE.convertList(transactionDOs);
//    }
//
//    /**
//    * 获得pay_transaction分页
//    *
//    * @param pageBO pay_transaction分页查询
//    * @return pay_transaction分页结果
//    */
//    public PageResult<TransactionBO> pageTransaction(TransactionPageBO pageBO) {
//        IPage<PayTransactionDO> transactionDOPage = transactionMapper.selectPage(pageBO);
//        return TransactionConvert.INSTANCE.convertPage(transactionDOPage);
//    }

}
