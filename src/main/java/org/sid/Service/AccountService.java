package org.sid.Service;

import org.sid.Entity.AppRole;
import org.sid.Entity.AppUser;

public interface AccountService {
    public AppUser saveUser(String username, String password, String confirmedPassword);
    public AppRole save(AppRole r);
    public AppUser loadUserByUsername(String username);
    public void addRoleToUser(String username,String role);
}
