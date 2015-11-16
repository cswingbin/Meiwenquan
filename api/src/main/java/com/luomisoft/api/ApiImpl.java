package com.luomisoft.api;

import com.google.gson.reflect.TypeToken;
import com.luomisoft.model.ArticleModel;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * @author Lenovo(cswingbin)
 * @datetime 2015-11-16 16:26 GMT+8
 * @email 703998061qq.com
 */
public class ApiImpl implements Api {
    private final static String APP_KEY="ANDROID_ARTICLE";
    private final static String TIME_OUT_EVENT="CONNECT_TIME_OUT";
    private final static String TIME_OUT_EVENT_MSG="连接服务器失败";


    @Override
    public ApiResponse<List<ArticleModel>> listArticle(int currentPage, int pageSize) {
        Map<String ,String> paramMap=new HashMap<String,String>();
        paramMap.put("appKey",APP_KEY);
        paramMap.put("method",LIST_ARTICLE);
        paramMap.put("currentPage",String.valueOf(currentPage));
        paramMap.put("pageSize",String.valueOf(pageSize));

        Type type=new TypeToken<ApiResponse<List<ArticleModel>>>(){}.getType();




        return null;
    }
}
