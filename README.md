# Single-Sign-On

### Introduction

We are going to implement single-sign-on (SSO) using:

- Keycloak as Identity-Provider (IdP)
- Flame as the first client.
- Mobster as the second client for the IdP.

### Expected flow

- when a user trying to access a protected page of Flame Application will be redirected to the login page of Keycloak.
- after a user login to a keycloak page the user will be redirected to the protected page of Flame application.
- when user trying to access a protected page of Mobster Application user will be allowed to view page withen the same session of Flame Applicagtion.
