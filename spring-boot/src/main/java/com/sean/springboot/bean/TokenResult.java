package com.sean.springboot.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author sean
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class TokenResult {
    protected String token;
}
