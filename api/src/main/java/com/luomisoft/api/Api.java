package com.luomisoft.api;

import com.luomisoft.model.ArticleModel;

import java.util.List;

/**
 *
 * Api 接口
 *
 * Lenovo(cswingbin)
 * @datetime 2015-11-16 16:08 GMT+8
 * @email 703998061qq.com
 */
public interface Api {

    //文章列表
    public final static String LIST_ARTICLE="luomisoft.listarticle";


    /**
     *文章列表
     *
     * @param currentPage   当前页数
     * @param pageSize      每页显示数量
     * @return              成功时返回{"code":0,"msg":"success","objList":[....]}
     */
    public ApiResponse<List<ArticleModel>> listArticle(int currentPage,int pageSize);


}
