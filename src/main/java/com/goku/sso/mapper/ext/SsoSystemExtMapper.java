package com.goku.sso.mapper.ext;

import com.goku.sso.mapper.SsoSystemMapper;
import com.goku.sso.model.SsoSystem;

/**
 * Created by nbfujx on 2018/1/19.
 */
public interface SsoSystemExtMapper extends SsoSystemMapper {
    SsoSystem selectByCode(String code);
}
