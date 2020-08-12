.PHONY: all
all: test e2e

.PHONY: test
test:
	npm run test -- --no-watch --no-progress --browsers=ChromeHeadlessCI

.PHONY: e2e
e2e:
	npm run e2e -- --protractor-config=e2e/protractor-ci.conf.js

.PHONY: serve
serve:
	ng serve --open
