<%@ page language="java" buffer="none" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<a href="<c:url value="/account/"/>"><button>Account</button></a><a href="<c:url value="/dungeon/"/>"><button>Dungeon</button></a><a href="<c:url value="/raider/?create"/>"><button>Raider</button></a>