# Inventory Management System

A web application project built with **Next.js, React, TypeScript, and NestJS**. This project is organized into separate frontend and backend applications to support the development of an inventory management system.

## Tech Stack

### Frontend

* Next.js
* React
* TypeScript
* Tailwind CSS

### Backend

* NestJS
* Node.js
* TypeScript
* REST API

## Project Structure

```text
inventory-management-system/
├── backend/
│   ├── src/
│   │   ├── app.controller.ts
│   │   ├── app.module.ts
│   │   ├── app.service.ts
│   │   └── main.ts
│   ├── package.json
│   └── README.md
│
├── frontend/
│   ├── app/
│   │   ├── page.tsx
│   │   ├── layout.tsx
│   │   └── globals.css
│   └── package.json
│
└── README.md
```

## Getting Started

### Prerequisites

Make sure you have installed:

* [Node.js](https://nodejs.org/)
* npm
* Git

### 1. Clone the Repository

```bash
git clone https://github.com/vijaym09/inventory-management-system.git
cd inventory-management-system
```

### 2. Run the Backend

Open a terminal and execute:

```bash
cd backend
npm install
npm run start:dev
```

The NestJS server runs on:

```text
http://localhost:3000
```

The current root endpoint returns a simple `Hello World!` response.

### 3. Run the Frontend

Open another terminal from the project root:

```bash
cd frontend
npm install
npm run dev
```

Open the application in your browser:

```text
http://localhost:3000
```

If the backend is already using port `3000`, Next.js may use another available port, such as `3001`. Use the URL printed in your terminal.

## Development

The project separates the frontend and backend so they can be developed independently.

* **Frontend:** User interface and client-side functionality.
* **Backend:** Server-side logic and API endpoints.

## Current Status

This repository currently contains the initial Next.js and NestJS application setup. Inventory-specific functionality is still under development.

## Future Improvements

* Product and inventory management
* Add, update, and delete products
* Stock quantity tracking
* Search and filter products
* Inventory dashboard
* Database integration
* Input validation and error handling
* Frontend integration with backend APIs
* Authentication and authorization

## Contributing

Contributions, suggestions, and feedback are welcome. Feel free to fork the repository and submit a pull request.

## Author

**Vijay Malviya**

* GitHub: [@vijaym09](https://github.com/vijaym09)

## License

This project is currently a personal development project. A license can be added when the project is ready for distribution.
