package org.sid.Security;

public interface SycurityParams {
    public static final String JWT_HEADER_NAME = "Authorization";
    public static final String SECRET = "sara@senouni.com";
    public static final long EXPIRATION = 10*24*3600;
    public static final String HEADER_PREFIX = "Bearer ";
}
