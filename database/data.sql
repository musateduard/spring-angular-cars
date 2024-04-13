--
-- PostgreSQL database dump
--

-- Dumped from database version 14.11 (Ubuntu 14.11-0ubuntu0.22.04.1)
-- Dumped by pg_dump version 14.11 (Ubuntu 14.11-0ubuntu0.22.04.1)

SET statement_timeout = 0;
SET lock_timeout = 0;
SET idle_in_transaction_session_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SELECT pg_catalog.set_config('search_path', '', false);
SET check_function_bodies = false;
SET xmloption = content;
SET client_min_messages = warning;
SET row_security = off;

--
-- Data for Name: engines; Type: TABLE DATA; Schema: main; Owner: user1
--

COPY main.engines (id, manufacturer, year, capacity, horsepower) FROM stdin;
\.


--
-- Data for Name: owners; Type: TABLE DATA; Schema: main; Owner: user1
--

COPY main.owners (id, name, age) FROM stdin;
\.


--
-- Data for Name: cars; Type: TABLE DATA; Schema: main; Owner: user1
--

COPY main.cars (id, name, color, year, engine, owner) FROM stdin;
\.


--
-- Data for Name: cars_owners; Type: TABLE DATA; Schema: main; Owner: user1
--

COPY main.cars_owners (car, owner) FROM stdin;
\.


--
-- Name: cars_id_seq; Type: SEQUENCE SET; Schema: main; Owner: user1
--

SELECT pg_catalog.setval('main.cars_id_seq', 1, false);


--
-- Name: engines_id_seq; Type: SEQUENCE SET; Schema: main; Owner: user1
--

SELECT pg_catalog.setval('main.engines_id_seq', 1, false);


--
-- Name: owners_id_seq; Type: SEQUENCE SET; Schema: main; Owner: user1
--

SELECT pg_catalog.setval('main.owners_id_seq', 1, false);


--
-- PostgreSQL database dump complete
--

